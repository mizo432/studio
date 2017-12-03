package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifiers;
import org.venuspj.ddd.model.entity.EntityIdentifiers;

import java.util.Collection;

public class EventIdentifiers extends AbstractEntityIdentifiers<Event> implements EntityIdentifiers<Event> {

    public EventIdentifiers(Collection<? extends EventIdentifier> anyCollection) {
        super(anyCollection);


    }

}
