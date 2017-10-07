package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

import static org.venuspj.util.objects2.Objects2.*;

public class Studio extends OrganizationRoleImpl {

    public Studio(OrganizationUnit anOrganization) {
        super(anOrganization);
    }

    @Override
    public Party clone() {
        return new Studio(organizationUnit);
    }


    @Override
    public String toString() {
        return toStringHelper(this)
                .omitNullValues()
                .toString();
    }
}
