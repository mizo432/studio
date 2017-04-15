package jp.or.venuspj.studio.core.model.studio;

import jp.or.venuspj.ddd.model.entity.EntityBuilder;
import jp.or.venuspj.studo.generic.fundamentals.caption.Caption;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/03/25.
 */
public class StudioBuilder extends EntityBuilder<Studio, StudioBuilder> {
    Caption caption;

    @Override
    protected void apply(Studio vo, StudioBuilder builder) {
        super.apply(vo, builder);
        builder.withCaption(vo.caption);
    }

    public StudioBuilder withCaption(Caption aCaption) {
        if (Objects2.nonNull(aCaption))
            addConfigurator(builder -> builder.caption = aCaption);
        return getThis();
    }

    @Override
    protected Studio createValueObject() {
        return new Studio(identifier, caption);
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
