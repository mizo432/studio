package org.venuspj.studio.core.usecases.studio;

import org.venuspj.studio.core.model.studio.Studio;
import org.venuspj.studio.core.usecases.UseCaseOutputPort;

public class StudioQueryOutputPort implements UseCaseOutputPort {
    private final Studio studio;

    public StudioQueryOutputPort(Studio aStudio) {
        studio = aStudio;
    }
    
}
