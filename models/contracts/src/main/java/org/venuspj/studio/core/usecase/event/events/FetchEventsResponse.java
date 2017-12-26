package org.venuspj.studio.core.usecase.event.events;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.event.Events;

public interface FetchEventsResponse extends Response {
    void setEvents(Events events);

}
