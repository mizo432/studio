package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.model.event.EventIdentifier;

public class EventCredential {
    private EventIdentifier eventIdentifier = EventIdentifier.empty();

    public EventCredential(EventIdentifier anIdentifier) {
        eventIdentifier = anIdentifier;
    }

    public EventIdentifier eventId() {
        return eventIdentifier;
    }
}
