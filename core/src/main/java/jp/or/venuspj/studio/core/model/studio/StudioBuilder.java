package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ColorUml.domain.fundamentals.Name.Name;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Thing;
import jp.or.venuspj.ddd.model.entity.EntityBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class StudioBuilder extends EntityBuilder<Studio, StudioBuilder> {
    private Name name;
    Thing thing;

    public StudioBuilder withName(Name aName) {
        if (Objects2.isNull(aName)) return getThis();
        addConfigurator(builder -> builder.name = aName);
        return getThis();
    }

    @Override
    protected void apply(Studio vo, StudioBuilder builder) {
        super.apply(vo, builder);
        builder.withThing(vo.thing);
    }

    @Override
    protected Studio createValueObject() {
        return new Studio(identifier, thing);
    }

    @Override
    protected StudioBuilder getThis() {
        return this;
    }

    @Override
    protected StudioBuilder newInstance() {
        return new StudioBuilder();
    }

    public StudioBuilder withThing(Thing aThing) {
        if (Objects2.isNull(aThing)) return getThis();
        addConfigurator(builder -> builder.thing = aThing);
        return getThis();
    }
}
