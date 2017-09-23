package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class EventId extends AbstractEntityIdentifier<Event> {
    private final Integer value;

    public EventId(Integer aValue) {
        super(Event.class);
        value = aValue;
    }

    public static EventId defaultEventId() {
        return new EventId(-1);
    }

    public Integer asInteger() {
        return value;
    }

    public boolean isPresent() {
        return Integer.valueOf(-1).equals(value);
    }
}
