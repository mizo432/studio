package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;

/**
 */
public class EventQueryInputPortMock implements EventQueryInputPort {
    private EventIdentifier eventIdentifier;

    public EventQueryInputPortMock(EventIdentifier anEventIdentifier) {
        eventIdentifier = anEventIdentifier;
    }

    @Override
    public EventIdentifier getEventIdentifier() {
        return eventIdentifier;
    }
}
