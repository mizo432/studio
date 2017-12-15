package org.venuspj.studio.core.usecase.studio;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

public interface StudioQueryOutputPort extends Response {

    void setStudio(Studio studio);
}
