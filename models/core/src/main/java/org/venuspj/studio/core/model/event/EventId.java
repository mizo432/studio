package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

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

    @Override
    public String toString() {
        return string()
                .add("value", value)
                .omitNullValues()
                .toString();
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        return o instanceof EventId && equal(((EventId) o).kind, kind) && equal(((EventId) o).value, value);
    }
}
