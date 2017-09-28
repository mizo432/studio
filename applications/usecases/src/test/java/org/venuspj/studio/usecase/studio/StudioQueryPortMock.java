package org.venuspj.studio.usecase.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.usecase.studio.StudioQueryInputPort;
import org.venuspj.studio.core.usecase.studio.StudioQueryOutputPort;
import org.venuspj.util.objects2.Objects2;

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
    public EntityIdentifier<Studio> getStudioId() {
        return null;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("studioCode", studioCode)
                .add("studio", studio)
                .omitNullValues()
                .toString();
    }
}
