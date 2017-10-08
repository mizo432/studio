package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class EventQueryOutputPortMock implements EventQueryOutputPort {
    Event event;

    @Override
    public void withEvent(Event anEvent) {
        event = anEvent;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("event", event)
                .omitNullValues()
                .toString();
    }

    public Event getEvent() {
        return event;
    }
}
