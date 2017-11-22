package org.venuspj.ddd.model.entity;

import java.util.Collection;

public class DefaultEntityIdentifiers<E extends Entity<E>> extends AbstractEntityIdentifiers<E> implements EntityIdentifiers<E> {

    private DefaultEntityIdentifiers() {

    }

    public <EI extends EntityIdentifier<E>> DefaultEntityIdentifiers(Collection<EI> anyCollection) {
        super(anyCollection);
    }

    @SuppressWarnings(value = "unchecked")
    public static <E extends Entity<E>> EntityIdentifiers<E> emptyEntityIdentifiers() {
        return new DefaultEntityIdentifiers();
    }

}
