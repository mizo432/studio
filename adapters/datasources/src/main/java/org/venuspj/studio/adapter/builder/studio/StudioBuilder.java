package org.venuspj.studio.adapter.builder.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.isNull;

public class StudioBuilder extends ObjectBuilder<Studio, StudioBuilder> {
    private Name name;
    private EntityIdentifier<Studio> identifier;
    private Profile profile;
    private Descriptor descriptor;


    @Override
    protected void apply(Studio vo, StudioBuilder builder) {
        builder.withName(vo.getName());
        builder.withIdentifier(vo.identifier());
        builder.withProfile(vo.getProfile());
        builder.withDescriptor(vo.getDescriptor());

    }

    public StudioBuilder withName(Name aName) {
        if (isNull(aName)) return getThis();
        addConfigurator(builder -> builder.name = aName);
        return getThis();
    }

    public StudioBuilder withIdentifier(EntityIdentifier<Studio> anIdentifier) {
        if (isNull(anIdentifier)) return getThis();
        addConfigurator(builder -> builder.identifier = anIdentifier);
        return getThis();
    }

    public StudioBuilder withProfile(Profile aProfile) {
        if (isNull(aProfile)) return getThis();
        addConfigurator(builder -> builder.profile = aProfile);
        return getThis();
    }

    public StudioBuilder withDescriptor(Descriptor aDescriptor) {
        if (isNull(aDescriptor)) return getThis();
        addConfigurator(builder -> builder.descriptor = aDescriptor);
        return getThis();
    }

    @Override
    protected Studio createValueObject() {
        return new Studio(name, identifier, profile, descriptor);

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
