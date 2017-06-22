package org.venuspj.studio.core.model.event;

import org.venuspj.util.objects2.Objects2;

public class EventId {
    Integer value;

    EventId() {
    }

    public EventId(Integer aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public static EventId defaultEventId() {
        return new EventId();
    }
}