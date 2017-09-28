package org.venuspj.studio.adapter.builder.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

public class StudioBuilder extends ObjectBuilder<Studio, StudioBuilder> {
    private Organization organization;


    @Override
    protected void apply(Studio vo, StudioBuilder builder) {

    }

    public StudioBuilder withOrganization(Organization anOrganization) {
        if (isNull(anOrganization)) return getThis();
        addConfigurator(builder -> builder.organization = anOrganization);
        return getThis();
    }


    @Override
    protected Studio createValueObject() {
        return new Studio(organization);

    }

    @Override
    protected StudioBuilder getThis() {
        return this;
    }

    @Override
    protected StudioBuilder newInstance() {
        return new StudioBuilder();
    }
}
