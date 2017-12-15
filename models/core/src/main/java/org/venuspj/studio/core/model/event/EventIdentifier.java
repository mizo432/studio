package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class EventIdentifier extends AbstractEntityIdentifier<Event> {
    private Integer value;

    public EventIdentifier(Integer aValue) {
        this();
        value = aValue;
    }

    public EventIdentifier() {
        super(Event.class);

    }

    /**
     * 空のイベントIDを取得する
     *
     * @return 空のイベントID
     */
    public static EventIdentifier empty() {
        return new EventIdentifier();
    }

    public Integer asInteger() {
        return value;
    }

    public boolean isPresent() {
        return nonNull(value);
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (isNull(o)) return false;
        return o instanceof EventIdentifier &&
                equal(((EventIdentifier) o).kind, kind) &&
                equal(((EventIdentifier) o).value, value);
    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }
}
