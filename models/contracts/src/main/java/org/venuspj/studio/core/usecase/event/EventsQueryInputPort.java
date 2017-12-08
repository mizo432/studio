package org.venuspj.studio.core.usecase.event;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.event.EventCriteria;

public interface EventsQueryInputPort extends Request {
    EventCriteria getEventCriteria();

}
