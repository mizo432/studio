package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studios;
import org.venuspj.studio.core.usecase.studio.FetchStudioRequest;
import org.venuspj.studio.core.usecase.studio.FetchStudioResponse;
import org.venuspj.studio.core.usecase.studio.FetchStudioUseCase;

@Service
public class FetchStudioImpl implements FetchStudioUseCase{
    private final StudioRepository studioRepository;

    @Autowired
    FetchStudioImpl(StudioRepository aStudioRepository){
        studioRepository = aStudioRepository;

    }
    @Override
    public void execute(FetchStudioRequest request, FetchStudioResponse response) {
        Studios studios = studioRepository.resolve(request.getStudioCriteria());
        response.setStudio(studios.first());

    }
}
