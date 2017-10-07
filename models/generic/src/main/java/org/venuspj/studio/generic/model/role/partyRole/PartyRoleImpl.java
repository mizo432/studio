package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.DefaultParty;
import org.venuspj.studio.generic.model.ppt.party.Party;

public abstract class PartyRoleImpl implements Party, PartyRole {

    protected final Party party;

    public PartyRoleImpl() {
        this(DefaultParty.emptyParty());
    }

    /**
     * コンストラクター
     *
     * @param aParty
     */
    public PartyRoleImpl(Party aParty) {
        party = aParty;
    }

    @Override
    public EntityIdentifier<Party> identifier() {
        return party.identifier();
    }

    @Override
    public abstract Party clone();

}
