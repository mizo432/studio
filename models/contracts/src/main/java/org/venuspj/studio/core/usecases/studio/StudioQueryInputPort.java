package org.venuspj.studio.core.usecases.studio;

import org.venuspj.studio.core.model.studio.StudioCredential;
import org.venuspj.cleanArchitecture.useCase.UseCaseInputPort;

public class StudioQueryInputPort implements UseCaseInputPort {
    public StudioCredential toCredential() {
        return new StudioCredential();
    }

}
