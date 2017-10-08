package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.event.EventId;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;

/**
 */
public class EventQueryInputPortMock implements EventQueryInputPort {
    private EventId eventId;

    public EventQueryInputPortMock(EventId anEventId) {
        eventId = anEventId;
    }

    @Override
    public EventId getEventId() {
        return eventId;
    }
}
