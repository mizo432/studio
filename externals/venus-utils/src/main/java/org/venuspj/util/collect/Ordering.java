package org.venuspj.util.collect;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

import static org.venuspj.util.base.Preconditions.checkNotNull;
import static org.venuspj.util.collect.CollectPreconditions.checkNonNegative;
import static org.venuspj.util.collect.Lists2.newArrayList;

public abstract class Ordering<T> implements Comparator<T> {

    @SuppressWarnings("unchecked") // TODO(kevinb): right way to explain this??
    public static <C extends Comparable> Ordering<C> natural() {
        return (Ordering<C>) NaturalOrdering.INSTANCE;
    }


    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return (comparator instanceof Ordering)
                ? (Ordering<T>) comparator
                : new ComparatorOrdering<T>(comparator);
    }


    public static <T> Ordering<T> explicit(List<T> valuesInOrder) {
        return new ExplicitOrdering<T>(valuesInOrder);
    }

    public static <T> Ordering<T> explicit(T leastValue, T... remainingValuesInOrder) {
        return explicit(Lists2.asList(leastValue, remainingValuesInOrder));
    }

    @SuppressWarnings("unchecked")
    public static Ordering<Object> allEqual() {
        return AllEqualOrdering.INSTANCE;
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    public static Ordering<Object> arbitrary() {
        return ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    private static class ArbitraryOrderingHolder {
        static final Ordering<Object> ARBITRARY_ORDERING = new ArbitraryOrdering();
    }

    static class ArbitraryOrdering extends Ordering<Object> {

        private final AtomicInteger counter = new AtomicInteger(0);
        private final ConcurrentMap<Object, Integer> uids =
                Platform.tryWeakKeys(new MapMaker()).makeMap();

        private Integer getUid(Object obj) {
            Integer uid = uids.get(obj);
            if (uid == null) {
                // One or more integer values could be skipped in the event of a race
                // to generate a UID for the same object from multiple threads, but
                // that shouldn't be a problem.
                uid = counter.getAndIncrement();
                Integer alreadySet = uids.putIfAbsent(obj, uid);
                if (alreadySet != null) {
                    uid = alreadySet;
                }
            }
            return uid;
        }

        @Override
        public int compare(Object left, Object right) {
            if (left == right) {
                return 0;
            } else if (left == null) {
                return -1;
            } else if (right == null) {
                return 1;
            }
            int leftCode = identityHashCode(left);
            int rightCode = identityHashCode(right);
            if (leftCode != rightCode) {
                return leftCode < rightCode ? -1 : 1;
            }

            int result = getUid(left).compareTo(getUid(right));
            if (result == 0) {
                throw new AssertionError(); // extremely, extremely unlikely.
            }
            return result;
        }

        @Override
        public String toString() {
            return "Ordering.arbitrary()";
        }

        int identityHashCode(Object object) {
            return System.identityHashCode(object);
        }
    }

    protected Ordering() {}


    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering<S>(this);
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering<S>(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering<S>(this);
    }

    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new ByFunctionOrdering<>(function, this);
    }

    <T2 extends T> Ordering<Map.Entry<T2, ?>> onKeys() {
        return onResultOf(Maps2.<T2>keyFunction());
    }

    public <U extends T> Ordering<U> compound(Comparator<? super U> secondaryComparator) {
        return new CompoundOrdering<U>(this, checkNotNull(secondaryComparator));
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> comparators) {
        return new CompoundOrdering<T>(comparators);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering<S>(this);
    }

    @Override
    public abstract int compare( T left,  T right);

    public <E extends T> E min(Iterator<E> iterator) {
        // let this throw NoSuchElementException as necessary
        E minSoFar = iterator.next();

        while (iterator.hasNext()) {
            minSoFar = min(minSoFar, iterator.next());
        }

        return minSoFar;
    }

    public <E extends T> E min(Iterable<E> iterable) {
        return min(iterable.iterator());
    }

    public <E extends T> E min( E a,  E b) {
        return (compare(a, b) <= 0) ? a : b;
    }

    public <E extends T> E min( E a,  E b,  E c, E... rest) {
        E minSoFar = min(min(a, b), c);

        for (E r : rest) {
            minSoFar = min(minSoFar, r);
        }

        return minSoFar;
    }

    public <E extends T> E max(Iterator<E> iterator) {
        // let this throw NoSuchElementException as necessary
        E maxSoFar = iterator.next();

        while (iterator.hasNext()) {
            maxSoFar = max(maxSoFar, iterator.next());
        }

        return maxSoFar;
    }

    public <E extends T> E max(Iterable<E> iterable) {
        return max(iterable.iterator());
    }

    public <E extends T> E max( E a,  E b) {
        return (compare(a, b) >= 0) ? a : b;
    }

    public <E extends T> E max( E a,  E b,  E c, E... rest) {
        E maxSoFar = max(max(a, b), c);

        for (E r : rest) {
            maxSoFar = max(maxSoFar, r);
        }

        return maxSoFar;
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int k) {
        if (iterable instanceof Collection) {
            Collection<E> collection = (Collection<E>) iterable;
            if (collection.size() <= 2L * k) {
                // In this case, just dumping the collection to an array and sorting is
                // faster than using the implementation for Iterator, which is
                // specialized for k much smaller than n.

                @SuppressWarnings("unchecked") // c only contains E's and doesn't escape
                        E[] array = (E[]) collection.toArray();
                Arrays.sort(array, this);
                if (array.length > k) {
                    array = Arrays.copyOf(array, k);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), k);
    }

    public <E> List<E> leastOf(Iterator<? extends E> iterator, int k) {
        checkNotNull(iterator);
        checkNonNegative(k, "k");

        if (k == 0 || !iterator.hasNext()) {
            return Collections.emptyList();
        } else if (k >= Integer.MAX_VALUE / 2) {
            ArrayList<E> list = newArrayList(iterator);
            Collections.sort(list, this);
            if (list.size() > k) {
                list.subList(k, list.size()).clear();
            }
            list.trimToSize();
            return Collections.unmodifiableList(list);
        } else {
            TopKSelector<E> selector = TopKSelector.least(k, this);
            selector.offerAll(iterator);
            return selector.topK();
        }
    }


    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int k) {
        return reverse().leastOf(iterable, k);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> iterator, int k) {
        return reverse().leastOf(iterator, k);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> elements) {
        @SuppressWarnings("unchecked") // does not escape, and contains only E's
                E[] array = (E[]) Iterables.toArray(elements);
        Arrays.sort(array, this);
        return newArrayList(Arrays.asList(array));
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> elements) {
        return ImmutableList.sortedCopyOf(this, elements);
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T prev = it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (compare(prev, next) > 0) {
                    return false;
                }
                prev = next;
            }
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T prev = it.next();
            while (it.hasNext()) {
                T next = it.next();
                if (compare(prev, next) >= 0) {
                    return false;
                }
                prev = next;
            }
        }
        return true;
    }

    static class IncomparableValueException extends ClassCastException {
        final Object value;

        IncomparableValueException(Object value) {
            super("Cannot compare value: " + value);
            this.value = value;
        }

        private static final long serialVersionUID = 0;
    }

    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;
}