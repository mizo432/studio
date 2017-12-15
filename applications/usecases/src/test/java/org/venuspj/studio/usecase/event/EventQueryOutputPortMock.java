package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class EventQueryOutputPortMock implements EventQueryOutputPort {
    Event event;

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("events", event)
                .omitNullValues()
                .toString();
    }

    public Event getEvent() {
        return event;
    }

    @Override
    public void setEvent(Event anEvent) {
        event = anEvent;

    }
}
