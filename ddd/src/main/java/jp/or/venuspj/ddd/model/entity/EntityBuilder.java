package jp.or.venuspj.ddd.model.entity;

import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 *
 */
public abstract class EntityBuilder<E extends Entity<E>, B extends EntityBuilder<E, B>> extends ObjectBuilder<E, B> {

    protected EntityIdentifier<E> identifier;

    @Override
    protected void apply(E vo, B builder) {
        builder.withEntityIdentifier(vo.getIdentifier());
    }

    public B withEntityIdentifier(EntityIdentifier<E> anIdentifier) {
        if (Objects2.isNull(anIdentifier)) return getThis();
        addConfigurator(builder -> builder.identifier = anIdentifier);
        return getThis();

    }
}