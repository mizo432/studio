package org.venuspj.util.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;

import static org.venuspj.util.base.Preconditions.*;
import static org.venuspj.util.collect.CollectPreconditions.checkNonNegative;
import static org.venuspj.util.collect.ObjectArrays.checkElementsNotNull;

@SuppressWarnings("serial") // we're overriding default serialization
public abstract class ImmutableList<E> extends ImmutableCollection<E>
        implements List<E>, RandomAccess {

    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return CollectCollectors.toImmutableList();
    }

    @SuppressWarnings("unchecked")
    public static <E> ImmutableList<E> of() {
        return (ImmutableList<E>) EMPTY;
    }

    public static <E> ImmutableList<E> of(E element) {
        return new SingletonImmutableList<E>(element);
    }

    public static <E> ImmutableList<E> of(E e1, E e2) {
        return construct(e1, e2);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3) {
        return construct(e1, e2, e3);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4) {
        return construct(e1, e2, e3, e4);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5) {
        return construct(e1, e2, e3, e4, e5);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return construct(e1, e2, e3, e4, e5, e6);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> ImmutableList<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> ImmutableList<E> of(
            E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    public static <E> ImmutableList<E> of(
            E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    public static <E> ImmutableList<E> of(
            E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... others) {
        Object[] array = new Object[12 + others.length];
        array[0] = e1;
        array[1] = e2;
        array[2] = e3;
        array[3] = e4;
        array[4] = e5;
        array[5] = e6;
        array[6] = e7;
        array[7] = e8;
        array[8] = e9;
        array[9] = e10;
        array[10] = e11;
        array[11] = e12;
        System.arraycopy(others, 0, array, 12, others.length);
        return construct(array);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> elements) {
        checkNotNull(elements);
        return (elements instanceof Collection)
                ? copyOf((Collection<? extends E>) elements)
                : copyOf(elements.iterator());
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> elements) {
        if (elements instanceof ImmutableCollection) {
            @SuppressWarnings("unchecked") // all supported methods are covariant
                    ImmutableList<E> list = ((ImmutableCollection<E>) elements).asList();
            return list.isPartialView() ? ImmutableList.<E>asImmutableList(list.toArray()) : list;
        }
        return construct(elements.toArray());
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> elements) {
        // We special-case for 0 or 1 elements, but going further is madness.
        if (!elements.hasNext()) {
            return of();
        }
        E first = elements.next();
        if (!elements.hasNext()) {
            return of(first);
        } else {
            return new ImmutableList.Builder<E>().add(first).addAll(elements).build();
        }
    }

    public static <E> ImmutableList<E> copyOf(E[] elements) {
        switch (elements.length) {
            case 0:
                return of();
            case 1:
                return of(elements[0]);
            default:
                return construct(elements.clone());
        }
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(
            Iterable<? extends E> elements) {
        Comparable<?>[] array = Iterables.toArray(elements, new Comparable<?>[0]);
        checkElementsNotNull((Object[]) array);
        Arrays.sort(array);
        return asImmutableList(array);
    }

    public static <E> ImmutableList<E> sortedCopyOf(
            Comparator<? super E> comparator, Iterable<? extends E> elements) {
        checkNotNull(comparator);
        @SuppressWarnings("unchecked") // all supported methods are covariant
                E[] array = (E[]) Iterables.toArray(elements);
        checkElementsNotNull(array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    private static <E> ImmutableList<E> construct(Object... elements) {
        return asImmutableList(checkElementsNotNull(elements));
    }

    static <E> ImmutableList<E> asImmutableList(Object[] elements) {
        return asImmutableList(elements, elements.length);
    }

    static <E> ImmutableList<E> asImmutableList(Object[] elements, int length) {
        switch (length) {
            case 0:
                return of();
            case 1:
                return of((E) elements[0]);
            default:
                if (length < elements.length) {
                    elements = Arrays.copyOf(elements, length);
                }
                return new RegularImmutableList<E>(elements);
        }
    }

    ImmutableList() {}

    @Override
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override
    public UnmodifiableListIterator<E> listIterator(int index) {
        return new AbstractIndexedListIterator<E>(size(), index) {
            @Override
            protected E get(int index) {
                return ImmutableList.this.get(index);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super E> consumer) {
        checkNotNull(consumer);
        int n = size();
        for (int i = 0; i < n; i++) {
            consumer.accept(get(i));
        }
    }

    @Override
    public int indexOf( Object object) {
        return (object == null) ? -1 : Lists2.indexOfImpl(this, object);
    }

    @Override
    public int lastIndexOf( Object object) {
        return (object == null) ? -1 : Lists2.lastIndexOfImpl(this, object);
    }

    @Override
    public boolean contains( Object object) {
        return indexOf(object) >= 0;
    }

    @Override
    public ImmutableList<E> subList(int fromIndex, int toIndex) {
        checkPositionIndexes(fromIndex, toIndex, size());
        int length = toIndex - fromIndex;
        if (length == size()) {
            return this;
        } else if (length == 0) {
            return of();
        } else if (length == 1) {
            return of(get(fromIndex));
        } else {
            return subListUnchecked(fromIndex, toIndex);
        }
    }

    ImmutableList<E> subListUnchecked(int fromIndex, int toIndex) {
        return new SubList(fromIndex, toIndex - fromIndex);
    }

    class SubList extends ImmutableList<E> {
        final transient int offset;
        final transient int length;

        SubList(int offset, int length) {
            this.offset = offset;
            this.length = length;
        }

        @Override
        public int size() {
            return length;
        }

        @Override
        public E get(int index) {
            checkElementIndex(index, length);
            return ImmutableList.this.get(index + offset);
        }

        @Override
        public ImmutableList<E> subList(int fromIndex, int toIndex) {
            checkPositionIndexes(fromIndex, toIndex, length);
            return ImmutableList.this.subList(fromIndex + offset, toIndex + offset);
        }

        @Override
        boolean isPartialView() {
            return true;
        }
    }

    @Deprecated
    @Override
    public final boolean addAll(int index, Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final E remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final void replaceAll(UnaryOperator<E> operator) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final void sort(Comparator<? super E> c) {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns this list instance.
     *
     * @since 2.0
     */
    @Override
    public final ImmutableList<E> asList() {
        return this;
    }

    @Override
    public Spliterator<E> spliterator() {
        return CollectSpliterators.indexed(size(), SPLITERATOR_CHARACTERISTICS, this::get);
    }

    @Override
    int copyIntoArray(Object[] dst, int offset) {
        // this loop is faster for RandomAccess instances, which ImmutableLists are
        int size = size();
        for (int i = 0; i < size; i++) {
            dst[offset + i] = get(i);
        }
        return offset + size;
    }

    public ImmutableList<E> reverse() {
        return (size() <= 1) ? this : new ReverseImmutableList<E>(this);
    }

    private static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;

        ReverseImmutableList(ImmutableList<E> backingList) {
            this.forwardList = backingList;
        }

        private int reverseIndex(int index) {
            return (size() - 1) - index;
        }

        private int reversePosition(int index) {
            return size() - index;
        }

        @Override
        public ImmutableList<E> reverse() {
            return forwardList;
        }

        @Override
        public boolean contains( Object object) {
            return forwardList.contains(object);
        }

        @Override
        public int indexOf( Object object) {
            int index = forwardList.lastIndexOf(object);
            return (index >= 0) ? reverseIndex(index) : -1;
        }

        @Override
        public int lastIndexOf( Object object) {
            int index = forwardList.indexOf(object);
            return (index >= 0) ? reverseIndex(index) : -1;
        }

        @Override
        public ImmutableList<E> subList(int fromIndex, int toIndex) {
            checkPositionIndexes(fromIndex, toIndex, size());
            return forwardList.subList(reversePosition(toIndex), reversePosition(fromIndex)).reverse();
        }

        @Override
        public E get(int index) {
            checkElementIndex(index, size());
            return forwardList.get(reverseIndex(index));
        }

        @Override
        public int size() {
            return forwardList.size();
        }

        @Override
        boolean isPartialView() {
            return forwardList.isPartialView();
        }
    }

    @Override
    public boolean equals( Object obj) {
        return Lists2.equalsImpl(this, obj);
    }

    @Override
    public int hashCode() {
        int hashCode = 1;
        int n = size();
        for (int i = 0; i < n; i++) {
            hashCode = 31 * hashCode + get(i).hashCode();

            hashCode = ~~hashCode;
            // needed to deal with GWT integer overflow
        }
        return hashCode;
    }

    static class SerializedForm implements Serializable {
        final Object[] elements;

        SerializedForm(Object[] elements) {
            this.elements = elements;
        }

        Object readResolve() {
            return copyOf(elements);
        }

        private static final long serialVersionUID = 0;
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> Builder<E> builder() {
        return new Builder<E>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int expectedSize) {
        checkNonNegative(expectedSize, "expectedSize");
        return new ImmutableList.Builder<E>(expectedSize);
    }

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        /**
         * Creates a new builder. The returned builder is equivalent to the builder
         * generated by {@link ImmutableList#builder}.
         */
        public Builder() {
            this(DEFAULT_INITIAL_CAPACITY);
        }

        Builder(int capacity) {
            super(capacity);
        }

        @Override
        public Builder<E> add(E element) {
            super.add(element);
            return this;
        }

        @Override
        public Builder<E> addAll(Iterable<? extends E> elements) {
            super.addAll(elements);
            return this;
        }

        @Override
        public Builder<E> add(E... elements) {
            super.add(elements);
            return this;
        }

        @Override
        public Builder<E> addAll(Iterator<? extends E> elements) {
            super.addAll(elements);
            return this;
        }

        @Override
        Builder<E> combine(ArrayBasedBuilder<E> builder) {
            super.combine(builder);
            return this;
        }

        @Override
        public ImmutableList<E> build() {
            forceCopy = true;
            return asImmutableList(contents, size);
        }
    }
}