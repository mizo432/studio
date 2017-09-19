package org.venuspj.util.collect;

import java.util.function.Consumer;

@SuppressWarnings("serial") // uses writeReplace, not default serialization
class RegularImmutableAsList<E> extends ImmutableAsList<E> {
    private final ImmutableCollection<E> delegate;
    private final ImmutableList<? extends E> delegateList;

    RegularImmutableAsList(ImmutableCollection<E> delegate, ImmutableList<? extends E> delegateList) {
        this.delegate = delegate;
        this.delegateList = delegateList;
    }

    RegularImmutableAsList(ImmutableCollection<E> delegate, Object[] array) {
        this(delegate, ImmutableList.<E>asImmutableList(array));
    }

    @Override
    ImmutableCollection<E> delegateCollection() {
        return delegate;
    }

    ImmutableList<? extends E> delegateList() {
        return delegateList;
    }

    @SuppressWarnings("unchecked")
    @Override
    public UnmodifiableListIterator<E> listIterator(int index) {
        return (UnmodifiableListIterator<E>) delegateList.listIterator(index);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        delegateList.forEach(action);
    }

    @Override
    int copyIntoArray(Object[] dst, int offset) {
        return delegateList.copyIntoArray(dst, offset);
    }

    @Override
    public E get(int index) {
        return delegateList.get(index);
    }
}