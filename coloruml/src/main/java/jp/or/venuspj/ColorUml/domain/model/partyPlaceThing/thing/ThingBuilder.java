package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.thing;

import jp.or.venuspj.ColorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.ColorUml.domain.model.partyPlaceThing.Thing;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class ThingBuilder extends ObjectBuilder<Thing, ThingBuilder> {
    private PartyPlaceThing partyPlaceThing;

    @Override
    protected void apply(Thing vo, ThingBuilder builder) {
        ThingImpl concreteVo = (ThingImpl) vo;
        builder.withPartyPlaceThing(concreteVo.partyPlaceThing);

    }

    public ThingBuilder withPartyPlaceThing(PartyPlaceThing aPartyPlaceThing) {
        if (Objects2.isNull(aPartyPlaceThing)) return getThis();
        addConfigurator(builder -> builder.partyPlaceThing = aPartyPlaceThing);
        return getThis();
    }

    @Override
    protected Thing createValueObject() {
        return new ThingImpl(partyPlaceThing);
    }

    @Override
    protected ThingBuilder getThis() {
        return this;
    }

    @Override
    protected ThingBuilder newInstance() {
        return new ThingBuilder();
    }
}
