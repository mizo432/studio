package org.venuspj.todox.core.model.actor;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class ActorId extends AbstractEntityIdentifier<Actor> {
    private final Integer value;

    public ActorId(Integer aValue) {
        super(Actor.class);
        value = aValue;
    }

}
