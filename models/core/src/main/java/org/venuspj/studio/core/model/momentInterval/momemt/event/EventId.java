package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.hash;

public class EventId extends AbstractEntityIdentifier<Event> {
    Integer value;

    EventId() {
        super(Event.class);
    }

    public EventId(Integer aValue) {
        super(Event.class);
        value = aValue;
    }

    public static EventId defaultEventId() {
        return new EventId();
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (o instanceof EventId) {
            EventId other = (EventId) o;
            return Objects2.equal(value, other.value);
        }
        return false;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("kind", kind)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }
}
