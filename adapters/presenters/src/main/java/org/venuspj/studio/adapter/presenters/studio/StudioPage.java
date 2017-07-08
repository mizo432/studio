package org.venuspj.studio.adapter.presenters.studio;

import org.venuspj.cleanArchitecture.useCase.UseCaseOutputPort;
import org.venuspj.studio.core.model.studio.Studio;

public class StudioPage implements UseCaseOutputPort {
    private final Studio studio;

    public StudioPage(Studio aStudio) {
        studio = aStudio;
    }

}
