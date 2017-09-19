package org.venuspj.util.collect;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.venuspj.util.base.Preconditions.checkNotNull;

@SuppressWarnings("rawtypes")
public final class Range<C extends Comparable>
        implements Predicate<C>, Serializable {

    @Override
    public boolean test(C c) {
        return false;
    }

    static class LowerBoundFn implements Function<Range, Cut> {
        static final LowerBoundFn INSTANCE = new LowerBoundFn();

        @Override
        public Cut apply(Range range) {
            return range.lowerBound;
        }
    }

    static class UpperBoundFn implements Function<Range, Cut> {
        static final UpperBoundFn INSTANCE = new UpperBoundFn();

        @Override
        public Cut apply(Range range) {
            return range.upperBound;
        }
    }

    @SuppressWarnings("unchecked")
    static <C extends Comparable<?>> Function<Range<C>, Cut<C>> lowerBoundFn() {
        return (Function) LowerBoundFn.INSTANCE;
    }

    @SuppressWarnings("unchecked")
    static <C extends Comparable<?>> Function<Range<C>, Cut<C>> upperBoundFn() {
        return (Function) UpperBoundFn.INSTANCE;
    }

    static <C extends Comparable<?>> Ordering<Range<C>> rangeLexOrdering() {
        return (Ordering<Range<C>>) (Ordering) RangeLexOrdering.INSTANCE;
    }

    static <C extends Comparable<?>> Range<C> create(Cut<C> lowerBound, Cut<C> upperBound) {
        return new Range<C>(lowerBound, upperBound);
    }

    public static <C extends Comparable<?>> Range<C> open(C lower, C upper) {
        return create(Cut.aboveValue(lower), Cut.belowValue(upper));
    }

    public static <C extends Comparable<?>> Range<C> closed(C lower, C upper) {
        return create(Cut.belowValue(lower), Cut.aboveValue(upper));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C lower, C upper) {
        return create(Cut.belowValue(lower), Cut.belowValue(upper));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C lower, C upper) {
        return create(Cut.aboveValue(lower), Cut.aboveValue(upper));
    }

    public static <C extends Comparable<?>> Range<C> range(
            C lower, BoundType lowerType, C upper, BoundType upperType) {
        checkNotNull(lowerType);
        checkNotNull(upperType);

        Cut<C> lowerBound =
                (lowerType == BoundType.OPEN) ? Cut.aboveValue(lower) : Cut.belowValue(lower);
        Cut<C> upperBound =
                (upperType == BoundType.OPEN) ? Cut.belowValue(upper) : Cut.aboveValue(upper);
        return create(lowerBound, upperBound);
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C endpoint) {
        return create(Cut.<C>belowAll(), Cut.belowValue(endpoint));
    }

    public static <C extends Comparable<?>> Range<C> atMost(C endpoint) {
        return create(Cut.<C>belowAll(), Cut.aboveValue(endpoint));
    }

    public static <C extends Comparable<?>> Range<C> upTo(C endpoint, BoundType boundType) {
        switch (boundType) {
            case OPEN:
                return lessThan(endpoint);
            case CLOSED:
                return atMost(endpoint);
            default:
                throw new AssertionError();
        }
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C endpoint) {
        return create(Cut.aboveValue(endpoint), Cut.<C>aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C endpoint) {
        return create(Cut.belowValue(endpoint), Cut.<C>aboveAll());
    }

    public static <C extends Comparable<?>> Range<C> downTo(C endpoint, BoundType boundType) {
        switch (boundType) {
            case OPEN:
                return greaterThan(endpoint);
            case CLOSED:
                return atLeast(endpoint);
            default:
                throw new AssertionError();
        }
    }

    private static final Range<Comparable> ALL = new Range<>(Cut.belowAll(), Cut.aboveAll());

    @SuppressWarnings("unchecked")
    public static <C extends Comparable<?>> Range<C> all() {
        return (Range) ALL;
    }

    public static <C extends Comparable<?>> Range<C> singleton(C value) {
        return closed(value, value);
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> values) {
        checkNotNull(values);
        if (values instanceof SortedSet) {
            SortedSet<? extends C> set = cast(values);
            Comparator<?> comparator = set.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed(set.first(), set.last());
            }
        }
        Iterator<C> valueIterator = values.iterator();
        C min = checkNotNull(valueIterator.next());
        C max = min;
        while (valueIterator.hasNext()) {
            C value = checkNotNull(valueIterator.next());
            min = Ordering.natural().min(min, value);
            max = Ordering.natural().max(max, value);
        }
        return closed(min, max);
    }

    final Cut<C> lowerBound;
    final Cut<C> upperBound;

    private Range(Cut<C> lowerBound, Cut<C> upperBound) {
        this.lowerBound = checkNotNull(lowerBound);
        this.upperBound = checkNotNull(upperBound);
        if (lowerBound.compareTo(upperBound) > 0
                || lowerBound == Cut.<C>aboveAll()
                || upperBound == Cut.<C>belowAll()) {
            throw new IllegalArgumentException("Invalid range: " + toString(lowerBound, upperBound));
        }
    }

    /**
     * Returns {@code true} if this range has a lower endpoint.
     */
    public boolean hasLowerBound() {
        return lowerBound != Cut.belowAll();
    }

    public C lowerEndpoint() {
        return lowerBound.endpoint();
    }

    public BoundType lowerBoundType() {
        return lowerBound.typeAsLowerBound();
    }

    public boolean hasUpperBound() {
        return upperBound != Cut.aboveAll();
    }

    public C upperEndpoint() {
        return upperBound.endpoint();
    }

    public BoundType upperBoundType() {
        return upperBound.typeAsUpperBound();
    }

    public boolean isEmpty() {
        return lowerBound.equals(upperBound);
    }

    public boolean contains(C value) {
        checkNotNull(value);
        return lowerBound.isLessThan(value) && !upperBound.isLessThan(value);
    }


    public boolean containsAll(Iterable<? extends C> values) {
        if (Iterables.isEmpty(values)) {
            return true;
        }

        if (values instanceof SortedSet) {
            SortedSet<? extends C> set = cast(values);
            Comparator<?> comparator = set.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return contains(set.first()) && contains(set.last());
            }
        }

        for (C value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public boolean encloses(Range<C> other) {
        return lowerBound.compareTo(other.lowerBound) <= 0
                && upperBound.compareTo(other.upperBound) >= 0;
    }

    public boolean isConnected(Range<C> other) {
        return lowerBound.compareTo(other.upperBound) <= 0
                && other.lowerBound.compareTo(upperBound) <= 0;
    }

    public Range<C> intersection(Range<C> connectedRange) {
        int lowerCmp = lowerBound.compareTo(connectedRange.lowerBound);
        int upperCmp = upperBound.compareTo(connectedRange.upperBound);
        if (lowerCmp >= 0 && upperCmp <= 0) {
            return this;
        } else if (lowerCmp <= 0 && upperCmp >= 0) {
            return connectedRange;
        } else {
            Cut<C> newLower = (lowerCmp >= 0) ? lowerBound : connectedRange.lowerBound;
            Cut<C> newUpper = (upperCmp <= 0) ? upperBound : connectedRange.upperBound;
            return create(newLower, newUpper);
        }
    }

    public Range<C> span(Range<C> other) {
        int lowerCmp = lowerBound.compareTo(other.lowerBound);
        int upperCmp = upperBound.compareTo(other.upperBound);
        if (lowerCmp <= 0 && upperCmp >= 0) {
            return this;
        } else if (lowerCmp >= 0 && upperCmp <= 0) {
            return other;
        } else {
            Cut<C> newLower = (lowerCmp <= 0) ? lowerBound : other.lowerBound;
            Cut<C> newUpper = (upperCmp >= 0) ? upperBound : other.upperBound;
            return create(newLower, newUpper);
        }
    }

    public Range<C> canonical(DiscreteDomain<C> domain) {
        checkNotNull(domain);
        Cut<C> lower = lowerBound.canonical(domain);
        Cut<C> upper = upperBound.canonical(domain);
        return (lower == lowerBound && upper == upperBound) ? this : create(lower, upper);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof Range) {
            Range<?> other = (Range<?>) object;
            return lowerBound.equals(other.lowerBound) && upperBound.equals(other.upperBound);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return lowerBound.hashCode() * 31 + upperBound.hashCode();
    }

    @Override
    public String toString() {
        return toString(lowerBound, upperBound);
    }

    private static String toString(Cut<?> lowerBound, Cut<?> upperBound) {
        StringBuilder sb = new StringBuilder(16);
        lowerBound.describeAsLowerBound(sb);
        sb.append("..");
        upperBound.describeAsUpperBound(sb);
        return sb.toString();
    }

    private static <T> SortedSet<T> cast(Iterable<T> iterable) {
        return (SortedSet<T>) iterable;
    }

    Object readResolve() {
        if (this.equals(ALL)) {
            return all();
        } else {
            return this;
        }
    }

    @SuppressWarnings("unchecked") // this method may throw CCE
    static int compareOrThrow(Comparable left, Comparable right) {
        return left.compareTo(right);
    }

    /**
     * Needed to serialize sorted collections of Ranges.
     */
    private static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {
        static final Ordering<Range<?>> INSTANCE = new RangeLexOrdering();

        @Override
        public int compare(Range<?> left, Range<?> right) {
            return ComparisonChain.start()
                    .compare(left.lowerBound, right.lowerBound)
                    .compare(left.upperBound, right.upperBound)
                    .result();
        }

        private static final long serialVersionUID = 0;
    }

    private static final long serialVersionUID = 0;
}