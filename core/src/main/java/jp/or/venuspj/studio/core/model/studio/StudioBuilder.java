package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.studo.general.fundamentals.name.Name;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/01/28.
 */
public class StudioBuilder extends ObjectBuilder<Studio, StudioBuilder> {
    private Name name;

    @Override
    protected void apply(Studio vo, StudioBuilder builder) {
        builder.withName(vo.name);
    }

    public StudioBuilder withName(Name aName) {
        if(Objects2.isNull(aName)) return getThis();
        addConfigurator(builder -> builder.name = aName);
        return getThis();
    }

    @Override
    protected Studio createValueObject() {
        return new Studio(name);
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
