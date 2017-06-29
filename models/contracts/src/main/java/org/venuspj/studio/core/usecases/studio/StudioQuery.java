package org.venuspj.studio.core.usecases.studio;

import org.venuspj.cleanArchitecture.useCase.UseCaseInteractor;
import org.venuspj.studio.adapter.presenters.studio.StudioQueryOutputPort;

public interface StudioQuery extends UseCaseInteractor<StudioQueryInputPort, StudioQueryOutputPort, StudioQuery> {
}
