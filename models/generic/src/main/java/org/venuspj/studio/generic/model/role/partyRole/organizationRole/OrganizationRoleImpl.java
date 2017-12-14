package org.venuspj.studio.generic.model.role.partyRole.organizationRole;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

import static org.venuspj.util.objects2.Objects2.isNull;

public abstract class OrganizationRoleImpl extends PartyRoleImpl implements OrganizationRole {

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

    public Organization getOrganization() {
        return (Organization) super.getParty();
    }

    public OrganizationRoleInformation getOrganizationRoleInformation() {
        return (OrganizationRoleInformation) super.getPartyRoleInformation();
    }

    public static abstract class Builder<O extends OrganizationRole, B extends Builder<O, B>> extends PartyRoleImpl.Builder<O, B> {
        protected Organization organization;

        @Override
        protected void apply(O vo, B builder) {
            builder.withOrganization(vo.getOrganization());
        }

        public B withOrganization(Organization anOrganization) {
            if (isNull(anOrganization)) return getThis();
            addConfigurator(builder -> builder.organization = anOrganization);
            return getThis();
        }

    }

}
