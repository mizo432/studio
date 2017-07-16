package org.venuspj.studio.core.usecase.event;

public interface EventQueryUseCase {
    EventQueryUseCase withEventQueryInputPort(EventQueryInputPort inputPort);

    EventQueryUseCase withEventQueryOutputPort(EventQueryOutputPort outputPort);

    void start();

}
