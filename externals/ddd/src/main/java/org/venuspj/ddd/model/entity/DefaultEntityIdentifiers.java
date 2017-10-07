package org.venuspj.ddd.model.entity;

import java.util.Collection;

public class DefaultEntityIdentifiers<E extends Entity<E>> extends AbstractEntityIdentifiers<E> {

    private DefaultEntityIdentifiers() {

    }

    public DefaultEntityIdentifiers(Collection<? extends EntityIdentifier<E>> anyCollection) {
        super(anyCollection);
    }

    @SuppressWarnings(value = "unchecked")
    public static <E extends Entity<E>> EntityIdentifiers<E> emptyEntityIdentifiers() {
        return new DefaultEntityIdentifiers();
    }

}
