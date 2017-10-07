package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifiers;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class OrganizationUnitIds extends AbstractEntityIdentifiers<Party> {

    public static OrganizationUnitIds emptyOrganizationUnitIds() {
        return new OrganizationUnitIds();
    }

}
