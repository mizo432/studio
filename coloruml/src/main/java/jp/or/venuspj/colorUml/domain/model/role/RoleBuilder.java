package jp.or.venuspj.colorUml.domain.model.role;

import jp.or.venuspj.colorUml.domain.model.MomentIntervals;
import jp.or.venuspj.colorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.colorUml.domain.model.Role;
import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * Created by mizoguchi on 2017/02/04.
 */
public class RoleBuilder extends ObjectBuilder<Role, RoleBuilder> {
    AssignedNumber assignedNumber;
    MomentIntervals momentIntervals;
    PartyPlaceThing partyPlaceThing;

    public RoleBuilder withPartyPlaceThing(PartyPlaceThing aPartyPlaceThing) {
        if (Objects2.isNull(aPartyPlaceThing)) return getThis();
        addConfigurator(builder -> builder.partyPlaceThing = aPartyPlaceThing);
        return getThis();
    }

    public RoleBuilder withMomentIntervals(MomentIntervals aMomentIntervals) {
        if (Objects2.isNull(aMomentIntervals)) return getThis();
        addConfigurator(builder -> builder.momentIntervals = aMomentIntervals);
        return getThis();
    }

    public RoleBuilder withAssignedNumber(AssignedNumber anAssignedNumber) {
        if (Objects2.isNull(anAssignedNumber)) return getThis();
        addConfigurator(builder -> builder.assignedNumber = anAssignedNumber);
        return getThis();
    }

    public RoleBuilder withAssignedNumber(Integer anAssignedNumber) {
        if (Objects2.isNull(anAssignedNumber)) return getThis();
        addConfigurator(builder -> builder.assignedNumber = new AssignedNumber(anAssignedNumber));
        return getThis();

    }

    @Override
    protected void apply(Role vo, RoleBuilder builder) {
        RoleImpl concreteVo = (RoleImpl) vo;
        builder.withAssignedNumber(concreteVo.assignedNumber);
        builder.withMomentIntervals(concreteVo.momentIntervals);
        builder.withPartyPlaceThing(concreteVo.partyPlaceThing);

    }

    @Override
    protected Role createValueObject() {
        return new RoleImpl(assignedNumber, momentIntervals, partyPlaceThing);
    }

    @Override
    protected RoleBuilder getThis() {
        return this;
    }

    @Override
    protected RoleBuilder newInstance() {
        return new RoleBuilder();
    }

}
