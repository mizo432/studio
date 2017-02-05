package jp.or.venuspj.ColorUml.domain.model.momentInterval;

import jp.or.venuspj.ColorUml.domain.fundamentals.DateOrDatetimeOrInterval.DateOrDatetimeOrInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetail;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervalDetails;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class MomentIntervalBuilder<MI extends MomentInterval<MI>, MID extends MomentIntervalDetail<MID>> extends ObjectBuilder<MI, MomentIntervalBuilder<MI,MID>> {
    DateOrDatetimeOrInterval dateOrDatetimeOrInterval;
    MomentIntervalDetails<MID> momentIntervalDetails;

    public MomentIntervalBuilder<MI, MID> withMomentIntervalDetails(MomentIntervalDetails<MID> aMomentIntervalDetails) {
        if (Objects2.isNull(aMomentIntervalDetails)) return getThis();
        addConfigurator(builder -> builder.momentIntervalDetails = aMomentIntervalDetails);
        return getThis();
    }

    public MomentIntervalBuilder<MI, MID> withDateOrDatetimeOrInterval(DateOrDatetimeOrInterval aDateOrDatetimeOrInterval) {
        if (Objects2.isNull(aDateOrDatetimeOrInterval)) return getThis();
        addConfigurator(builder -> builder.dateOrDatetimeOrInterval = aDateOrDatetimeOrInterval);
        return getThis();
    }

    @Override
    protected void apply(MI vo, MomentIntervalBuilder<MI, MID> builder) {
        MomentIntervalImpl concreteVo = (MomentIntervalImpl) vo;
        builder.withDateOrDatetimeOrInterval(concreteVo.dateOrDatetimeOrInterval);
        builder.withMomentIntervalDetails(concreteVo.momentIntervalDetails);

    }

    @Override
    protected MI createValueObject() {
        return (MI) new MomentIntervalImpl(dateOrDatetimeOrInterval, momentIntervalDetails);
    }

    @Override
    protected MomentIntervalBuilder<MI, MID> getThis() {
        return this;
    }

    @Override
    protected MomentIntervalBuilder<MI, MID> newInstance() {
        return new MomentIntervalBuilder<MI, MID>();
    }
}
