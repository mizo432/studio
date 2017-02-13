package jp.or.venuspj.colorUml.domain.model.role;

import com.google.common.base.MoreObjects;
import jp.or.venuspj.colorUml.domain.model.MomentIntervals;
import jp.or.venuspj.colorUml.domain.model.PartyPlaceThing;
import jp.or.venuspj.colorUml.domain.model.Role;
import jp.or.venuspj.util.objects2.Objects2;

/**
 */
public class RoleImpl implements Role {
    AssignedNumber assignedNumber;
    MomentIntervals momentIntervals;
    PartyPlaceThing partyPlaceThing;

    RoleImpl() {

    }

    public RoleImpl(AssignedNumber anAssignedNumber, MomentIntervals aMomentIntervals, PartyPlaceThing aPartyPlaceThing) {
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

    @Override
    public void assessAcrossMomentIntervals() {

    }
}
