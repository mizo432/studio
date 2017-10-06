package org.venuspj.ddd.model.entity;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Lists2.unmodifiableList;

public class AbstractEntities<E extends Entity<E>> implements Entities<E> {

    protected List<E> list = newArrayList();

    protected AbstractEntities(List<E> anyList) {
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
}
