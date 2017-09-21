package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class EventId extends AbstractEntityIdentifier<Event> {
    private final Integer value;

    EventId(Integer aValue) {
        super(Event.class);
        value = aValue;
    }
}
