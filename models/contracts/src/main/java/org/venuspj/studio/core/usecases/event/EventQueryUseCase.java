package org.venuspj.studio.core.usecases.event;

public interface EventQueryUseCase {
    EventQueryUseCase withEventQueryInputPort(EventQueryInputPort inputPort);

    EventQueryUseCase withEventQueryOutputPort(EventQueryOutputPort outputPort);

    void start();

}
