package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.studio.core.model.studio.Studio;
import org.venuspj.cleanArchitecture.useCase.UseCaseOutputPort;

public class StudioQueryOutputPort implements UseCaseOutputPort {
    private final Studio studio;

    public StudioQueryOutputPort(Studio aStudio) {
        studio = aStudio;
    }
    
}
