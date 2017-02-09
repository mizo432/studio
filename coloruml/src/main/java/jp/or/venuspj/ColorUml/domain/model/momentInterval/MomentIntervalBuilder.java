package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetails;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class MomentIntervalBuilder extends ObjectBuilder<MomentInterval, MomentIntervalBuilder> {
    DateOrDatetimeOrInterval dateOrDatetimeOrInterval;
    MomentIntervalDetails momentIntervalDetails;

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

    }

    @Override
    protected MomentInterval createValueObject() {
        return new MomentIntervalImpl(dateOrDatetimeOrInterval, momentIntervalDetails);
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
