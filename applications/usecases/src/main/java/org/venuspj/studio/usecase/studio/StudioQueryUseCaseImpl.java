package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.usecases.UseCaseInteractor;
import org.venuspj.studio.core.usecases.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecases.studio.StudioQueryOutputPort;
import org.venuspj.studio.core.usecases.studio.StudioQueryUseCase;
import org.venuspj.studio.service.StudioServiceImpl;

public class StudioQueryUseCaseImpl implements StudioQueryUseCase {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQueryUseCaseImpl(StudioServiceImpl aStudioService) {
        studioService = aStudioService;

    }


    @Override
    public UseCaseInteractor withInputPort(StudioQueryInputPort anUseCaseInputPort) {
        return null;
    }

    @Override
    public StudioQueryOutputPort start() {
        return null;
    }
}
