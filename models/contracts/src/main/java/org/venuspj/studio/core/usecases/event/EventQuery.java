package org.venuspj.studio.core.usecases.event;

import org.venuspj.cleanArchitecture.useCase.UseCaseInteractor;
import org.venuspj.studio.adapter.presenters.event.EventQueryOutputPort;

public interface EventQuery extends UseCaseInteractor<EventQueryInputPort, EventQueryOutputPort, EventQuery> {

}
