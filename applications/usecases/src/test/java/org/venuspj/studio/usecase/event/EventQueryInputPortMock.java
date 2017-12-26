package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.usecase.event.FetchEventRequest;

/**
 */
public class EventQueryInputPortMock implements FetchEventRequest {
    private EventIdentifier eventIdentifier;

    public EventQueryInputPortMock(EventIdentifier anEventIdentifier) {
        eventIdentifier = anEventIdentifier;
    }

    @Override
    public EventIdentifier getEventIdentifier() {
        return eventIdentifier;
    }
}
