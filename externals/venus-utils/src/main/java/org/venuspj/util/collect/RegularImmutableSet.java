package org.venuspj.util.collect;
import java.util.Spliterator;
import java.util.Spliterators;

@SuppressWarnings("serial") // uses writeReplace(), not default serialization
final class RegularImmutableSet<E> extends ImmutableSet<E> {
    static final RegularImmutableSet<Object> EMPTY =
            new RegularImmutableSet<>(new Object[0], 0, null, 0);

    private final transient Object[] elements;
    // the same elements in hashed positions (plus nulls)
    final transient Object[] table;
    // 'and' with an int to get a valid table index.
    private final transient int mask;
    private final transient int hashCode;

    RegularImmutableSet(Object[] elements, int hashCode, Object[] table, int mask) {
        this.elements = elements;
        this.table = table;
        this.mask = mask;
        this.hashCode = hashCode;
    }

    @Override
    public boolean contains( Object target) {
        Object[] table = this.table;
        if (target == null || table == null) {
            return false;
        }
        for (int i = Hashing.smearedHash(target); ; i++) {
            i &= mask;
            Object candidate = table[i];
            if (candidate == null) {
                return false;
            } else if (candidate.equals(target)) {
                return true;
            }
        }
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public UnmodifiableIterator<E> iterator() {
        return (UnmodifiableIterator<E>) Iterators.forArray(elements);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(elements, SPLITERATOR_CHARACTERISTICS);
    }

    @Override
    int copyIntoArray(Object[] dst, int offset) {
        System.arraycopy(elements, 0, dst, offset, elements.length);
        return offset + elements.length;
    }

    @Override
    ImmutableList<E> createAsList() {
        return (table == null) ? ImmutableList.<E>of() : new RegularImmutableAsList<E>(this, elements);
    }

    @Override
    boolean isPartialView() {
        return false;
    }

    @Override
    public int hashCode() {
        return hashCode;
    }

    @Override
    boolean isHashCodeFast() {
        return true;
    }
}