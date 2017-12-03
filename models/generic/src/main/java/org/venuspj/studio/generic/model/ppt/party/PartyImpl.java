package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

/**
 */
public abstract class PartyImpl extends PartyPlaceThingImpl<Party> implements Party, Entity<Party> {

    protected PartyInfo partyInfo = PartyInfo.emptyPartyInfo();

    @SuppressWarnings("unchecked")
    public <ID extends PartyIdentifier> PartyImpl(ID anIdentifier, PartyInfo aPartyInfo) {
        super(anIdentifier, aPartyInfo);
        partyInfo = aPartyInfo;
    }

}
