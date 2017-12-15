package org.venuspj.studio.core.usecase.studio;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCriteria;

public class FetchStudioRequest implements Request {
    StudioCriteria studioCriteria = StudioCriteria.empty();

    public FetchStudioRequest(String studioCode) {
        studioCriteria.getStudioCodeCriteria().equal(new StudioCode(studioCode));
    }

    public StudioCriteria getStudioCriteria() {
        return studioCriteria;

    }
}
