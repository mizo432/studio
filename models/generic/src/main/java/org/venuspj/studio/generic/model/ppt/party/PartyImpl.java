package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

import static org.venuspj.util.objects2.Objects2.isNull;

/**
 */
public abstract class PartyImpl extends PartyPlaceThingImpl<Party> implements Party, Entity<Party> {

    @SuppressWarnings("unchecked")
    public <ID extends PartyIdentifier> PartyImpl(ID anIdentifier, PartyInformation aPartyInfo) {
        super(anIdentifier, aPartyInfo);
    }

    public PartyInformation getPartyInformation() {
        return (PartyInformation) super.getPptInformation();
    }

    public boolean sameValueAs(PartyImpl that) {
        if (isNull(that)) return false;
        return super.sameValueAs(that);
    }
}
