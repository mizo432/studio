package jp.or.venuspj.colorUml.domain.model.momentInterval;

import jp.or.venuspj.colorUml.domain.model.MomentInterval;
import jp.or.venuspj.colorUml.domain.model.MomentIntervalDetail;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

public class MomentIntervalDetailBuilder extends ObjectBuilder<MomentIntervalDetail, MomentIntervalDetailBuilder> {
    private MomentInterval momentInterval;

    @Override
    protected void apply(MomentIntervalDetail vo, MomentIntervalDetailBuilder builder) {
        MomentIntervalDetailImpl concreteVo = (MomentIntervalDetailImpl) vo;
        builder.withMomentInterval(concreteVo.momentInterval);
    }

    private MomentIntervalDetailBuilder withMomentInterval(MomentInterval aMomentInterval) {
        if (Objects2.isNull(aMomentInterval)) return getThis();
        addConfigurator(builder -> builder.momentInterval = aMomentInterval);
        return null;
    }

    @Override
    protected MomentIntervalDetail createValueObject() {
        return new MomentIntervalDetailImpl(momentInterval);
    }

    @Override
    protected MomentIntervalDetailBuilder getThis() {
        return this;
    }

    @Override
    protected MomentIntervalDetailBuilder newInstance() {
        return new MomentIntervalDetailBuilder();
    }
}
