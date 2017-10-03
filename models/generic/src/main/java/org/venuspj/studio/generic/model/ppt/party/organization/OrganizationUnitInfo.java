package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyInfo;

public class OrganizationUnitInfo extends PartyInfo {
    private OrganizationUnitInfo() {

    }

    public static OrganizationUnitInfo emptyUnitInfo() {
        return new OrganizationUnitInfo();
    }
}
