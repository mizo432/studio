package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class OrganizationMock {
    public static Organization createDimmy() {
        return new OrganizationImpl(
                DefaultEntityIdentifier.newId(Party.class),
                OrganizationInfo.emptyOrganizationInfo(),
                OrganizationUnits.emptyOrganizationUnits()
        );
    }
}
