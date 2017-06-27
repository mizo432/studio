package org.venuspj.studio.core.usecases.event;

import org.venuspj.studio.core.model.event.EventCredential;
import org.venuspj.studio.core.usecases.UseCaseInputPort;

public class EventQueryInputPort implements UseCaseInputPort {
    public EventCredential toCredential() {
        return new EventCredential();
    }

}
