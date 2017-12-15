package org.venuspj.studio.core.usecase.event;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.event.EventIdentifier;

public interface EventQueryInputPort extends Request {
    EventIdentifier getEventIdentifier();
}
