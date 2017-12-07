package org.venuspj.studio.generic.model.role;

import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;

public abstract class RoleImpl implements Role {
    protected PartyPlaceThing getPartyPlaceThing() {
        return partyPlaceThing;
    }

    private PartyPlaceThing partyPlaceThing;
    private RoleInformation roleInformation;

    protected RoleImpl() {

    }

    /**
     * コンストラクター
     *
     * @param aPartyPlaceThing
     * @param aRoleInformation
     * @param <PPT>
     * @param <RI>
     */
    protected <PPT extends PartyPlaceThing,
            RI extends RoleInformation> RoleImpl(PartyPlaceThing aPartyPlaceThing,
                                                 RoleInformation aRoleInformation) {
        partyPlaceThing = aPartyPlaceThing;
        roleInformation = aRoleInformation;

    }

    protected RoleInformation getRoleInformation() {
        return roleInformation;

    }

}
