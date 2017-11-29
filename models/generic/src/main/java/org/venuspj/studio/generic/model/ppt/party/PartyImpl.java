package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

/**
 */
public abstract class PartyImpl<P extends Party<P>> extends PartyPlaceThingImpl<P> implements Party<P>, Entity<P> {

    protected PartyInfo partyInfo = PartyInfo.emptyPartyInfo();

    @SuppressWarnings("unchecked")
    public <ID extends EntityIdentifier<P>> PartyImpl(ID anIdentifier, PartyInfo aPartyInfo) {
        super(anIdentifier, aPartyInfo);
        partyInfo = aPartyInfo;
    }

}
