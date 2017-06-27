package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.usecases.studio.StudioQuery;
import org.venuspj.studio.core.usecases.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecases.studio.StudioQueryOutputPort;
import org.venuspj.studio.service.StudioServiceImpl;

public class StudioQueryImpl implements StudioQuery {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQueryImpl(StudioServiceImpl aStudioService) {
        studioService = aStudioService;

    }


    @Override
    public StudioQuery withInputPort(StudioQueryInputPort anUseCaseInputPort) {
        return null;
    }

    @Override
    public StudioQueryOutputPort start() {
        return null;
    }
}
