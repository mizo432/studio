package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

public class Studio extends OrganizationRoleImpl {

    public Studio(OrganizationUnit anOrganization) {
        super(anOrganization);
    }


    @Override
    public OrganizationUnit getOrganizationUnit() {
        return super.getOrganizationUnit();
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
