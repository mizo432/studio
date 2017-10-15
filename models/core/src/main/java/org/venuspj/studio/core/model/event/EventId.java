package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class EventId extends AbstractEntityIdentifier<Event> {
    private Integer value;

    public EventId(Integer aValue) {
        this();
        value = aValue;
    }

    public EventId() {
        super(Event.class);

    }

    /**
     * 空のイベントIDを取得する
     *
     * @return 空のイベントID
     */
    public static EventId emptyEventId() {
        return new EventId();
    }

    public Integer asInteger() {
        return value;
    }

    public boolean isPresent() {
        return nonNull(value);
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
