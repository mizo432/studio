package org.venuspj.ddd.model.entity;

import org.venuspj.ddd.model.value.ListValue;

import java.util.List;

public interface Entities<E extends Entity<E>> extends Cloneable, Iterable<E>, ListValue<E> {
    @Override
    List<E> asList();

    EntityIdentifiers<E> getIdentifiers();

}
