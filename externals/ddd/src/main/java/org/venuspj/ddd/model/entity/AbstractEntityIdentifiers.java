package org.venuspj.ddd.model.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class AbstractEntityIdentifiers<E extends Entity<E>> implements EntityIdentifiers<E> {

    protected List<EntityIdentifier<E>> list = newArrayList();

    protected AbstractEntityIdentifiers() {

    }

    protected AbstractEntityIdentifiers(Collection<? extends EntityIdentifier<E>> anyEntityIdentifiers) {
        list.addAll(anyEntityIdentifiers);
    }

    @Override
    public List<EntityIdentifier<E>> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<EntityIdentifier<E>> iterator() {
        return asList().iterator();
    }

    @Override
    public boolean equals(Object obj) {
        return (nonNull(obj) ||
                (this == obj) ||
                (obj instanceof AbstractEntityIdentifiers &&
                        equal(((AbstractEntityIdentifiers) obj).list, list)));

    }

    @Override
    public int hashCode() {
        return hash(list);
    }

}
