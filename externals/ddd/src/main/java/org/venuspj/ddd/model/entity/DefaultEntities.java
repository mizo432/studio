package org.venuspj.ddd.model.entity;

import java.util.Collection;

public class DefaultEntities<E extends Entity<E>> extends AbstractEntities<E> {

    protected DefaultEntities() {

    }

    protected DefaultEntities(Collection<? extends E> anyCollection) {
        super(anyCollection);

    }


}
