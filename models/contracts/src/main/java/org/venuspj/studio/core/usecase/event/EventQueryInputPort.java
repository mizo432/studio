package org.venuspj.studio.core.usecase.event;

import org.venuspj.cleanArchitecture.useCase.UseCaseInputPort;
import org.venuspj.studio.core.model.momentInterval.momemt.event.EventCredential;

public class EventQueryInputPort implements UseCaseInputPort {
    public EventCredential toCredential() {
        return new EventCredential();
    }

}
