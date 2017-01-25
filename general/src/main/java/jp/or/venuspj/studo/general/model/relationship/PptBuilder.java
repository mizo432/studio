package jp.or.venuspj.studo.general.model.relationship;

import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

public abstract class PptBuilder<O extends Ppt, B extends PptBuilder<O, B>> extends ObjectBuilder<O, B> {
    protected Role role;
    protected Description description;

    public B withRole(Role aRole) {
        if (Objects2.isNull(aRole)) return getThis();
        addConfigurator(builder -> builder.role = aRole);
        return getThis();
    }

    public B withDescription(Description aDescription) {
        if (Objects2.isNull(aDescription)) return getThis();
        addConfigurator(builder -> builder.description = aDescription);
        return getThis();
    }

}
