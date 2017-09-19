package org.venuspj.util.collect;

import java.io.Serializable;
import java.util.*;
import java.util.function.Predicate;

import static org.venuspj.util.base.Preconditions.checkNotNull;
import static org.venuspj.util.collect.CollectPreconditions.checkNonNegative;
import static org.venuspj.util.collect.ObjectArrays.checkElementsNotNull;

@SuppressWarnings("serial")
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable {
    static final int SPLITERATOR_CHARACTERISTICS =
            Spliterator.IMMUTABLE | Spliterator.NONNULL | Spliterator.ORDERED;

    ImmutableCollection() {}

    @Override
    public abstract UnmodifiableIterator<E> iterator();

    @Override
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, SPLITERATOR_CHARACTERISTICS);
    }

    private static final Object[] EMPTY_ARRAY = {};

    @Override
    public final Object[] toArray() {
        int size = size();
        if (size == 0) {
            return EMPTY_ARRAY;
        }
        Object[] result = new Object[size];
        copyIntoArray(result, 0);
        return result;
    }

    @Override
    public final <T> T[] toArray(T[] other) {
        checkNotNull(other);
        int size = size();
        if (other.length < size) {
            other = ObjectArrays.newArray(other, size);
        } else if (other.length > size) {
            other[size] = null;
        }
        copyIntoArray(other, 0);
        return other;
    }

    @Override
    public abstract boolean contains(Object object);

    @Deprecated
    @Override
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final boolean addAll(Collection<? extends E> newElements) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final boolean removeAll(Collection<?> oldElements) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final boolean retainAll(Collection<?> elementsToKeep) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        switch (size()) {
            case 0:
                return ImmutableList.of();
            case 1:
                return ImmutableList.of(iterator().next());
            default:
                return new RegularImmutableAsList<E>(this, toArray());
        }
    }

    abstract boolean isPartialView();

    int copyIntoArray(Object[] dst, int offset) {
        for (E e : this) {
            dst[offset++] = e;
        }
        return offset;
    }

    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    public abstract static class Builder<E> {
        static final int DEFAULT_INITIAL_CAPACITY = 4;

        static int expandedCapacity(int oldCapacity, int minCapacity) {
            if (minCapacity < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            // careful of overflow!
            int newCapacity = oldCapacity + (oldCapacity >> 1) + 1;
            if (newCapacity < minCapacity) {
                newCapacity = Integer.highestOneBit(minCapacity - 1) << 1;
            }
            if (newCapacity < 0) {
                newCapacity = Integer.MAX_VALUE;
                // guaranteed to be >= newCapacity
            }
            return newCapacity;
        }

        Builder() {}

        public abstract Builder<E> add(E element);

        public Builder<E> add(E... elements) {
            for (E element : elements) {
                add(element);
            }
            return this;
        }

        public Builder<E> addAll(Iterable<? extends E> elements) {
            for (E element : elements) {
                add(element);
            }
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> elements) {
            while (elements.hasNext()) {
                add(elements.next());
            }
            return this;
        }

        public abstract ImmutableCollection<E> build();
    }

    abstract static class ArrayBasedBuilder<E> extends ImmutableCollection.Builder<E> {
        Object[] contents;
        int size;
        boolean forceCopy;

        ArrayBasedBuilder(int initialCapacity) {
            checkNonNegative(initialCapacity, "initialCapacity");
            this.contents = new Object[initialCapacity];
            this.size = 0;
        }

        private void getReadyToExpandTo(int minCapacity) {
            if (contents.length < minCapacity) {
                this.contents =
                        Arrays.copyOf(
                                this.contents, expandedCapacity(contents.length, minCapacity));
                forceCopy = false;
            } else if (forceCopy) {
                this.contents = contents.clone();
                forceCopy = false;
            }
        }

        @Override
        public ArrayBasedBuilder<E> add(E element) {
            checkNotNull(element);
            getReadyToExpandTo(size + 1);
            contents[size++] = element;
            return this;
        }

        @Override
        public Builder<E> add(E... elements) {
            checkElementsNotNull(elements);
            getReadyToExpandTo(size + elements.length);
            System.arraycopy(elements, 0, contents, size, elements.length);
            size += elements.length;
            return this;
        }

        @Override
        public Builder<E> addAll(Iterable<? extends E> elements) {
            if (elements instanceof Collection) {
                Collection<?> collection = (Collection<?>) elements;
                getReadyToExpandTo(size + collection.size());
            }
            super.addAll(elements);
            return this;
        }

        ArrayBasedBuilder<E> combine(ArrayBasedBuilder<E> builder) {
            checkNotNull(builder);
            getReadyToExpandTo(size + builder.size);
            System.arraycopy(builder.contents, 0, this.contents, size, builder.size);
            size += builder.size;
            return this;
        }
    }
}