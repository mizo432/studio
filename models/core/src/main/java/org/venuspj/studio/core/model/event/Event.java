package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class Event extends AbstractEntity<Event> {

    public Event(EntityIdentifier<Event> anIdentifier) {
        super(anIdentifier);
    }
}
