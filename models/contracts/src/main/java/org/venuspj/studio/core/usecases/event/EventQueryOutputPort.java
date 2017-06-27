package org.venuspj.studio.core.usecases.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.usecases.UseCaseOutputPort;

public class EventQueryOutputPort implements UseCaseOutputPort {
    private final Event event;

    public EventQueryOutputPort(Event anEvent) {
        event = anEvent;
    }

}
