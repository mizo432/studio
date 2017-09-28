package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public class OrganizationRoleImpl extends PartyRoleImpl implements Entity<Party>, OrganizationRole {
    private final Organization organization;

    public OrganizationRoleImpl(Organization anOrganization) {
        super(anOrganization);
        organization = anOrganization;
    }

}
