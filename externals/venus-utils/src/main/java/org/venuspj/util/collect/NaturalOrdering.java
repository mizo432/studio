package org.venuspj.util.collect;

import java.io.Serializable;

import static org.venuspj.util.base.Preconditions.checkNotNull;

@SuppressWarnings("unchecked")
final class NaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final NaturalOrdering INSTANCE = new NaturalOrdering();

    private transient Ordering<Comparable> nullsFirst;
    private transient Ordering<Comparable> nullsLast;

    @Override
    public int compare(Comparable left, Comparable right) {
        checkNotNull(left); // for GWT
        checkNotNull(right);
        return left.compareTo(right);
    }

    @Override
    public <S extends Comparable> Ordering<S> nullsFirst() {
        Ordering<Comparable> result = nullsFirst;
        if (result == null) {
            result = nullsFirst = super.nullsFirst();
        }
        return (Ordering<S>) result;
    }

    @Override
    public <S extends Comparable> Ordering<S> nullsLast() {
        Ordering<Comparable> result = nullsLast;
        if (result == null) {
            result = nullsLast = super.nullsLast();
        }
        return (Ordering<S>) result;
    }

    @Override
    public <S extends Comparable> Ordering<S> reverse() {
        return (Ordering<S>) ReverseNaturalOrdering.INSTANCE;
    }

    // preserving singleton-ness gives equals()/hashCode() for free
    private Object readResolve() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "Ordering.natural()";
    }

    private NaturalOrdering() {}

    private static final long serialVersionUID = 0;
}