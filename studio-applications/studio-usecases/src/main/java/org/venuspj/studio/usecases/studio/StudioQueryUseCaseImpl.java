package org.venuspj.studio.usecases.studio;

import org.venuspj.studio.core.usecases.studio.StudioQueryUseCase;
import org.venuspj.studio.service.StudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class StudioQueryUseCaseImpl implements StudioQueryUseCase {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQueryUseCaseImpl(StudioServiceImpl aStudioService){
        studioService = aStudioService;

    }

}
