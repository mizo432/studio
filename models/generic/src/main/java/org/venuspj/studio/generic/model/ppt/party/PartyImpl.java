package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.name.Name;

/**
 */
public abstract class PartyImpl<P extends Party<P>> extends AbstractEntity<P> {

    @SuppressWarnings("unchecked")
    public PartyImpl(PartyId anIdentifier, Name aName) {
        super(anIdentifier);
    }

}
