package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.usecase.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryOutputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationRepository;

@Service
public class StudioQuery implements StudioQueryUseCase {

    private final StudioRepository studioRepository;

    @Autowired
    public StudioQuery(StudioRepository aStudioRepository) {
        studioRepository = aStudioRepository;

    }

    @Override
    public void execute(StudioQueryInputPort request, StudioQueryOutputPort response) {
        Studio studio = studioRepository.resolve(request.getStudioIdentifier());

        response.setStudio(studio);


    }

}