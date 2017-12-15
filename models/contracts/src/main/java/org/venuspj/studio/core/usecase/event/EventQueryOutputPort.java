package org.venuspj.studio.core.usecase.event;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.event.Event;

/**
 */
public interface EventQueryOutputPort extends Response {
    void setEvent(Event event);

}
