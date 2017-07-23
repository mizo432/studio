package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.ddd.model.entity.EntityIdentifier;

public class EventCredential {
    private EntityIdentifier<Event> eventId = EventId.defaultEventId();

    public EventCredential(EventId anEventId) {
        eventId = anEventId;
    }

    public EntityIdentifier<Event> eventId() {
        return eventId;
    }
}