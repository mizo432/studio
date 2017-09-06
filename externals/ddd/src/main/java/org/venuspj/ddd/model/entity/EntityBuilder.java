package org.venuspj.ddd.model.entity;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import org.venuspj.util.builder.ObjectBuilder;
import org.venuspj.util.objects2.Objects2;

/**
 *
 */
public abstract class EntityBuilder<E extends Entity<E>, B extends EntityBuilder<E, B>> extends ObjectBuilder<E, B> {

    protected EntityIdentifier<E> identifier;

    @Override
    protected void apply(E vo, B builder) {
        builder.withEntityIdentifier(vo.identifier());
    }

    @SuppressFBWarnings("URF_UNREAD_PUBLIC_OR_PROTECTED_FIELD")
    public B withEntityIdentifier(EntityIdentifier<E> anIdentifier) {
        if (Objects2.isNull(anIdentifier)) return getThis();
        addConfigurator(builder -> builder.identifier = anIdentifier);
        return getThis();

    }
}
