package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationImpl;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;

import static org.venuspj.util.objects2.Objects2.isNull;

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

    public static class Builder extends OrganizationRoleImpl.Builder<Studio, Builder> {

        StudioInformation studioInformation;

        @Override
        protected void apply(Studio vo, Builder builder) {
            super.apply(vo, builder);
            builder.withStudioInformation(vo.getStudioInformation());
        }


        private Builder withStudioInformation(StudioInformation aStudioInformation) {
            if (isNull(aStudioInformation)) return getThis();
            addConfigurator(builder -> builder.studioInformation = aStudioInformation);
            return getThis();
        }


        @Override
        protected Studio createValueObject() {
            return new Studio(organization, studioInformation);
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
