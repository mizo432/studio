package org.venuspj.ddd.model.entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public abstract class AbstractEntities<E extends Entity<E>> implements Entities<E> {

    protected List<E> list = newArrayList();

    protected AbstractEntities() {
    }

    protected AbstractEntities(Collection<? extends E> anyList) {
        list.addAll(anyList);
    }

    @Override
    public List<E> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<E> iterator() {
        return asList().iterator();
    }

    public Optional<E> findBy(Predicate<E> criteria) {
        return list.stream().filter(criteria).findAny();
    }

    @Override
    public abstract <EI extends EntityIdentifiers<E>>  EI getIdentifiers();

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }

}
