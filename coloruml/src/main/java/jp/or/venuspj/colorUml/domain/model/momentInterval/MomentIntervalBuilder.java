package jp.or.venuspj.colorUml.domain.model.momentInterval;

import jp.or.venuspj.colorUml.domain.fundamentals.dateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.colorUml.domain.model.MakeMomentInterval;
import jp.or.venuspj.colorUml.domain.model.MomentInterval;
import jp.or.venuspj.colorUml.domain.model.MomentIntervalDetails;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class MomentIntervalBuilder extends ObjectBuilder<MomentInterval, MomentIntervalBuilder> {
    private DateOrDatetimeOrInterval dateOrDatetimeOrInterval;
    private MomentIntervalDetails momentIntervalDetails;
    private MakeMomentInterval makeMomentInterval;

    public MomentIntervalBuilder withMomentIntervalDetails(MomentIntervalDetails aMomentIntervalDetails) {
        if (Objects2.isNull(aMomentIntervalDetails)) return getThis();
        addConfigurator(builder -> builder.momentIntervalDetails = aMomentIntervalDetails);
        return getThis();
    }

    public MomentIntervalBuilder withDateOrDatetimeOrInterval(DateOrDatetimeOrInterval aDateOrDatetimeOrInterval) {
        if (Objects2.isNull(aDateOrDatetimeOrInterval)) return getThis();
        addConfigurator(builder -> builder.dateOrDatetimeOrInterval = aDateOrDatetimeOrInterval);
        return getThis();
    }

    @Override
    protected void apply(MomentInterval vo, MomentIntervalBuilder builder) {
        MomentIntervalImpl concreteVo = (MomentIntervalImpl) vo;
        builder.withDateOrDatetimeOrInterval(concreteVo.dateOrDatetimeOrInterval);
        builder.withMomentIntervalDetails(concreteVo.momentIntervalDetails);
        builder.withMakeMomentInterval(concreteVo.makeMomentInterval);

    }

    public MomentIntervalBuilder withMakeMomentInterval(MakeMomentInterval aMakeMomentInterval) {
        if (Objects2.isNull(aMakeMomentInterval)) return getThis();
        addConfigurator(builder -> builder.makeMomentInterval = aMakeMomentInterval);
        return getThis();
    }

    @Override
    protected MomentInterval createValueObject() {
        return new MomentIntervalImpl(dateOrDatetimeOrInterval, momentIntervalDetails, makeMomentInterval);
    }

    @Override
    protected MomentIntervalBuilder getThis() {
        return this;
    }

    @Override
    protected MomentIntervalBuilder newInstance() {
        return new MomentIntervalBuilder();
    }
}
