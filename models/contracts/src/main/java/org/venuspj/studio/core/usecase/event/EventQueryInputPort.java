package org.venuspj.studio.core.usecase.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.EventCredential;

public interface EventQueryInputPort {
    public EventCredential toCredential();

}
