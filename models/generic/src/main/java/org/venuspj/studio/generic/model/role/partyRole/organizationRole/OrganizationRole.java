package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.role.partyRole.PartyRole;

public interface OrganizationRole extends PartyRole {

    Organization getOrganization();

    OrganizationRoleInformation getOrganizationRoleInformation();

}
