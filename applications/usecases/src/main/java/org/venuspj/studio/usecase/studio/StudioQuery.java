package org.venuspj.studio.usecase.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.usecase.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryOutputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryUseCase;

@Service
public class StudioQuery implements StudioQueryUseCase {

    StudioRepository studioRepository;
    private StudioQueryInputPort inputPort;
    private StudioQueryOutputPort outputPort;

    @Autowired
    public StudioQuery(StudioRepository aStudioRepository) {
        studioRepository = aStudioRepository;

    }

    @Override
    public StudioQueryUseCase withStudioQueryInputPort(StudioQueryInputPort anInputPort) {
        inputPort = anInputPort;
        return this;
    }

    @Override
    public StudioQueryUseCase withStudioQueryOutputPort(StudioQueryOutputPort anOutputPort) {
        outputPort = anOutputPort;
        return this;
    }

    @Override
    public void start() {
        EntityIdentifier<Studio> studioId = inputPort.getStudioId();
        Studio studio = studioRepository.resolve(studioId);
        outputPort.setStudio(studio);

    }

}
