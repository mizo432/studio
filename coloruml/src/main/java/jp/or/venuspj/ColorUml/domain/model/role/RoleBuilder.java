package jp.or.venuspj.ColorUml.domain.model.role;

import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervals;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class RoleBuilder<R extends RoleImpl<R, PPT, MI>, PPT extends Ppt<PPT>, MI extends MomentInterval<MI>> extends ObjectBuilder<R, RoleBuilder<R, PPT, MI>> {
    AssignedNumber assignedNumber;
    MomentIntervals<MI> momentIntervals;
    PPT partyPlaceThing;

    public RoleBuilder withPartyPlaceThing(PPT aPartyPlaceThing) {
        if (Objects2.isNull(aPartyPlaceThing)) return getThis();
        addConfigurator(builder -> builder.partyPlaceThing = aPartyPlaceThing);
        return getThis();
    }

    public RoleBuilder withMomentIntervals(MomentIntervals<MI> aMomentIntervals) {
        if (Objects2.isNull(aMomentIntervals)) return getThis();
        addConfigurator(builder -> builder.momentIntervals = aMomentIntervals);
        return getThis();
    }

    public RoleBuilder withAssignedNumber(AssignedNumber anAssignedNumber) {
        if (Objects2.isNull(anAssignedNumber)) return getThis();
        addConfigurator(builder -> builder.assignedNumber = anAssignedNumber);
        return getThis();
    }

    @Override
    protected void apply(R vo, RoleBuilder<R, PPT, MI> builder) {
        RoleImpl<R, PPT, MI> concreteVo = (RoleImpl) vo;
        builder.withAssignedNumber(concreteVo.assignedNumber);
        builder.withMomentIntervals(concreteVo.momentIntervals);
        builder.withPartyPlaceThing(concreteVo.partyPlaceThing);

    }

    @Override
    protected R createValueObject() {
        return (R) new RoleImpl<R, PPT, MI>(assignedNumber, momentIntervals, partyPlaceThing);
    }

    @Override
    protected RoleBuilder getThis() {
        return this;
    }

    @Override
    protected RoleBuilder newInstance() {
        return new RoleBuilder();
    }

    public RoleBuilder withAssignedNumber(Integer anAssignedNumber) {
        if (Objects2.isNull(anAssignedNumber)) return getThis();
        addConfigurator(builder -> builder.assignedNumber = new AssignedNumber(anAssignedNumber));
        return getThis();

    }
}
