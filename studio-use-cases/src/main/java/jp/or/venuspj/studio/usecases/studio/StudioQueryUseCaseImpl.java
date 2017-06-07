package jp.or.venuspj.studio.usecases.studio;

import jp.or.venuspj.studio.core.usecases.studio.StudioQueryUseCase;
import jp.or.venuspj.studio.service.StudioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class StudioQueryUseCaseImpl implements StudioQueryUseCase {

    private StudioServiceImpl studioService;

    @Autowired
    public StudioQueryUseCaseImpl(StudioServiceImpl aStudioService){
        studioService = aStudioService;

    }

}
