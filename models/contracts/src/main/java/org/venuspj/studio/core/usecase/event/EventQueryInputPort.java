package org.venuspj.studio.core.usecase.event;

import org.venuspj.studio.core.model.event.EventId;

public interface EventQueryInputPort {
    EventId getEventId();
}
