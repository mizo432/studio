package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

public class Studio extends OrganizationRoleImpl {


    public Studio(Organization anOrganization, StudioInformation aStudioInformation) {
        super(anOrganization, aStudioInformation);

    }

    public StudioInformation getStudioInformation() {
        return (StudioInformation) super.roleInfoInformation;
    }

    public Organization getOrganization() {
        return (Organization) super.roleInfoInformation;
    }
}
