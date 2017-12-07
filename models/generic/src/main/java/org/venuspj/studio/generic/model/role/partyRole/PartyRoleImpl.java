package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.role.RoleImpl;

public abstract class PartyRoleImpl extends RoleImpl implements PartyRole {

    public PartyRoleImpl() {
        this(null, null);
    }

    /**
     * コンストラクター
     *
     * @param aParty
     */
    protected <P extends Party, PR extends PartyRoleInformation> PartyRoleImpl(P aParty, PR aPartyRoleInformation) {
        super(aParty, aPartyRoleInformation);
    }

    protected Party getParty() {
        return (Party) super.partyPlaceThing;

    }

    protected PartyRoleInformation getPartyRoleInformation() {
        return (PartyRoleInformation) getRoleInformation();
    }
}
