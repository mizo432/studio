package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationImpl;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;
import org.venuspj.util.builder.ObjectBuilder;

public class Studio extends OrganizationRoleImpl {


    public <O extends Organization> Studio(O anOrganization, StudioInformation aStudioInformation) {
        super(anOrganization, aStudioInformation);

    }

    public StudioInformation getStudioInformation() {
        return (StudioInformation) super.getRoleInformation();
    }


    public static Studio empty() {
        return new Studio(OrganizationImpl.empty(), StudioInformation.empty());
    }

    public static class Builder extends ObjectBuilder<Studio, Builder> {

        @Override
        protected void apply(Studio vo, Builder builder) {

        }

        @Override
        protected Studio createValueObject() {
            return null;
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }

}
