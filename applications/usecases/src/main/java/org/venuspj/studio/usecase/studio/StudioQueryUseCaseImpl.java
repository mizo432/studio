package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.venuspj.studio.core.usecases.studio.StudioQueryUseCase;
import org.venuspj.studio.service.StudioServiceImpl;

public class StudioQueryUseCaseImpl implements StudioQueryUseCase {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQueryUseCaseImpl(StudioServiceImpl aStudioService){
        studioService = aStudioService;

    }

}
