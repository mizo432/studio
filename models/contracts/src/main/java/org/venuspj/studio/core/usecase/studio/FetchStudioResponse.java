package org.venuspj.studio.core.usecase.studio;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

public interface FetchStudioResponse extends Response {
    void setStudio(Studio studio);
}
