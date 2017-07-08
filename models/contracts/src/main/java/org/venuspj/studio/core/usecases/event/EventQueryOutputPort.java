package org.venuspj.studio.core.usecases.event;

import org.venuspj.studio.core.model.event.Event;

/**
 */
public interface EventQueryOutputPort {
    void withEvent(Event event);
}
