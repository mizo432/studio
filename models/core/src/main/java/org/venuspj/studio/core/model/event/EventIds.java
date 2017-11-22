package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifiers;
import org.venuspj.ddd.model.entity.EntityIdentifiers;

import java.util.Collection;

public class EventIds extends AbstractEntityIdentifiers<Event> implements EntityIdentifiers<Event> {

    public EventIds(Collection<? extends EventId> anyCollection) {
        super(anyCollection);


    }

}
