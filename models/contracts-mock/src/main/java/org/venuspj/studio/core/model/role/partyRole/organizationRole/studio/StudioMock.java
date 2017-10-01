package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitMock;

/**
 */
public class StudioMock {

    public static Studio createDummy() {
        return new Studio(OrganizationUnitMock.createDimmy(OrganizationUnitMock.OrganizationUnitType.EMPTY));
    }

}
