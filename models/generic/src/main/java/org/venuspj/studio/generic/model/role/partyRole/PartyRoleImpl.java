package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.role.RoleImpl;
import org.venuspj.util.builder.ObjectBuilder;

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
        return (Party) super.getPartyPlaceThing();

    }

    protected PartyRoleInformation getPartyRoleInformation() {
        return (PartyRoleInformation) getRoleInformation();
    }

    public static abstract class Builder<P extends PartyRole , B extends Builder<P,B>> extends ObjectBuilder<P,B> {
    }
}
