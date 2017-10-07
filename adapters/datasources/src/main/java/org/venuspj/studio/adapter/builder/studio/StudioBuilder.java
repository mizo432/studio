package org.venuspj.studio.adapter.builder.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioInfo;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class StudioBuilder extends ObjectBuilder<Studio, StudioBuilder> {
    private OrganizationUnit organizationUnit;
    private StudioInfo studioInfo;


    @Override
    protected void apply(Studio vo, StudioBuilder builder) {
        builder.withOrganization(vo.getOrganizationUnit());
        builder.withStudioInfo(vo.getStudioInfo());

    }

    public StudioBuilder withOrganization(OrganizationUnit anOrganizationUnit) {
        if (isNull(anOrganizationUnit)) return getThis();
        addConfigurator(builder -> builder.organizationUnit = anOrganizationUnit);
        return getThis();
    }

    public StudioBuilder withStudioInfo(StudioInfo aStudioInfo) {
        if (isNull(aStudioInfo)) return getThis();
        addConfigurator(builder -> builder.studioInfo = aStudioInfo);
        return getThis();
    }


    @Override
    protected Studio createValueObject() {
        return new Studio(organizationUnit, studioInfo);

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
