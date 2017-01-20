package jp.or.venuspj.studio.core.model;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

public class PlayerBuilder extends ObjectBuilder<Player,PlayerBuilder> {
    private EntityIdentifier<Player> identifier;
    private PlayerValue value;

    @Override
    protected void apply(Player vo, PlayerBuilder builder) {
        builder.withIdentifier(vo.identifier());
        builder.withPlayerValue(vo.value());

    }

    private PlayerBuilder withPlayerValue(PlayerValue aValue) {
        if(Objects2.isNull(aValue)) return getThis();
        addConfigurator(builder -> builder.value = aValue);
        return getThis();
    }

    private PlayerBuilder withIdentifier(EntityIdentifier<Player> anIdentifier) {
        if(Objects2.isNull(anIdentifier)) return getThis();
        addConfigurator(builder -> builder.identifier = anIdentifier);
        return getThis();
    }

    @Override
    protected Player createValueObject() {
        return new PlayerImpl(identifier, value);
    }

    @Override
    protected PlayerBuilder getThis() {
        return this;
    }

    @Override
    protected PlayerBuilder newInstance() {
        return new PlayerBuilder();
    }
}
