package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.ProfileMock;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitMock;

/**
 */
public class StudioMock {

    public static Studio createDummy() {
        return new Studio(OrganizationUnitMock.createDimmy(
                OrganizationUnitMock.OrganizationUnitType.STUDIO),
                studioInf());
    }

    private static StudioInfo studioInf() {
        return new StudioInfo(ProfileMock.createDummy());
    }

}
