package org.venuspj.studio.generic.model.role.partyRole;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class PartyRoleImpl implements Entity<Party>, PartyRole {
    private final Party party;

    public PartyRoleImpl(Party aParty) {
        party = aParty;
    }

    @Override
    public EntityIdentifier<Party> identifier() {
        return party.identifier();
    }

    @Override
    public Party clone() {
        return party.clone();
    }
}
