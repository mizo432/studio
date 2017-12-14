package org.venuspj.studio.usecase.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.usecase.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryOutputPort;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

/**
 */
public class StudioQueryPortMock implements StudioQueryInputPort, StudioQueryOutputPort {
    private String studioCode;
    private Studio studio;

    public StudioQueryPortMock(String aStudioCode) {
        studioCode = aStudioCode;

    }

    @Override
    public void setStudio(Studio aStudio) {
        studio = aStudio;

    }

    @Override
    public PartyIdentifier getStudioIdentifier() {
        return null;
    }
}
