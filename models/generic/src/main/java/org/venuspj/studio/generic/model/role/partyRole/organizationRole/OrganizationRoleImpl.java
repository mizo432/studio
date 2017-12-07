package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public class OrganizationRoleImpl extends PartyRoleImpl implements OrganizationRole {

    public OrganizationRoleImpl() {
        this(null, null);
    }

    /**
     * @param anOrganization
     * @param anRoleInformation
     * @param <O>
     * @param <OI>
     */
    protected <O extends Organization, OI extends OrganizationRoleInformation> OrganizationRoleImpl(O anOrganization, OI anRoleInformation) {
        super(anOrganization, anRoleInformation);
    }

    protected Organization getOrganization() {
        return (Organization) super.getParty();
    }

}
