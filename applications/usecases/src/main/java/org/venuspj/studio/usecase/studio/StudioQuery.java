package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.usecases.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecases.studio.StudioQueryOutputPort;
import org.venuspj.studio.core.usecases.studio.StudioQueryUseCase;
import org.venuspj.studio.service.StudioServiceImpl;

public class StudioQuery implements StudioQueryUseCase {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQuery(StudioServiceImpl aStudioService) {
        studioService = aStudioService;

    }

    @Override
    public StudioQueryUseCase withStudioQueryInputPort(StudioQueryInputPort anInputPort) {
        return this;
    }

    @Override
    public StudioQueryUseCase withStudioQueryOutputPort(StudioQueryOutputPort anOutputPort) {
        return this;
    }

    @Override
    public void start() {

    }

}
