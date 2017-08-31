package org.venuspj.todox.core.model.actor;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class Actor extends AbstractEntity<Actor>{
    public Actor(EntityIdentifier<Actor> anIdentifier){
        super(anIdentifier);
    }
}
