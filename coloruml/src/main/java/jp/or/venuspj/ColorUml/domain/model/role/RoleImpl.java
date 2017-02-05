package jp.or.venuspj.ColorUml.domain.model.role;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.ColorUml.domain.model.MomentInterval;
import jp.or.venuspj.ColorUml.domain.model.MomentIntervals;
import jp.or.venuspj.ColorUml.domain.model.Ppt;
import jp.or.venuspj.ColorUml.domain.model.Role;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class RoleImpl<R extends RoleImpl<R, PPT, MI>, PPT extends Ppt<PPT>, MI extends MomentInterval<MI>> implements Role<R> {
    AssignedNumber assignedNumber;
    MomentIntervals<MI> momentIntervals;
    PPT partyPlaceThing;

    RoleImpl() {

    }

    public RoleImpl(AssignedNumber anAssignedNumber, MomentIntervals<MI> aMomentIntervals, PPT aPartyPlaceThing) {
        assignedNumber = anAssignedNumber;
        momentIntervals = aMomentIntervals;
        partyPlaceThing = aPartyPlaceThing;

    }

    protected MoreObjects.ToStringHelper string() {
        return Objects2
                .toStringHelper(this)
                .add("assignedNumber", assignedNumber)
                .add("partyPlaceThing", partyPlaceThing);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
