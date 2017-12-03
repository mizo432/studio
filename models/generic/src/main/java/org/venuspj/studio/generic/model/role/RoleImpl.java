package org.venuspj.studio.generic.model.role;

import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;

public abstract class RoleImpl implements Role {
    protected PartyPlaceThing partyPlaceThing;
    protected RoleInfoInformation roleInfoInformation;

    protected RoleImpl() {

    }

    /**
     * コンストラクター
     *
     * @param aPartyPlaceThing
     * @param aRoleInfoInformation
     * @param <PPT>
     * @param <RI>
     */
    protected <PPT extends PartyPlaceThing,
            RI extends RoleInfoInformation> RoleImpl(PartyPlaceThing aPartyPlaceThing,
                                                     RoleInfoInformation aRoleInfoInformation) {
        partyPlaceThing = aPartyPlaceThing;
        roleInfoInformation = aRoleInfoInformation;

    }
}
