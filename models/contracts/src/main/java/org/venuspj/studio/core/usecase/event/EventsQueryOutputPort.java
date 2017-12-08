package org.venuspj.studio.core.usecase.event;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.event.Events;

public interface EventsQueryOutputPort extends Response {
    void setEvents(Events events);

}
