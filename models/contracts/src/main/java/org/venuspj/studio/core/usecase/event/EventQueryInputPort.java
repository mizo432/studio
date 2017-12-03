package org.venuspj.studio.core.usecase.event;

import org.venuspj.studio.core.model.event.EventIdentifier;

public interface EventQueryInputPort {
    EventIdentifier getEventIdentifier();
}
