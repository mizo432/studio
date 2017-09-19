package org.venuspj.util.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
abstract class ImmutableAsList<E> extends ImmutableList<E> {
    abstract ImmutableCollection<E> delegateCollection();

    @Override
    public boolean contains(Object target) {
        return delegateCollection().contains(target);
    }

    @Override
    public int size() {
        return delegateCollection().size();
    }

    @Override
    public boolean isEmpty() {
        return delegateCollection().isEmpty();
    }

    @Override
    boolean isPartialView() {
        return delegateCollection().isPartialView();
    }

    static class SerializedForm implements Serializable {
        final ImmutableCollection<?> collection;

        SerializedForm(ImmutableCollection<?> collection) {
            this.collection = collection;
        }

        Object readResolve() {
            return collection.asList();
        }

        private static final long serialVersionUID = 0;
    }

    private void readObject(ObjectInputStream stream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override
    Object writeReplace() {
        return new SerializedForm(delegateCollection());
    }
}