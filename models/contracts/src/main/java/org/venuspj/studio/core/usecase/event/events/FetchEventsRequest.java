package org.venuspj.studio.core.usecase.event.events;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.event.EventCriteria;

public interface FetchEventsRequest extends Request {
    EventCriteria getEventCriteria();

}
