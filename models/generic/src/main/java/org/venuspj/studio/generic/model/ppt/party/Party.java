package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThing;

/**
 */
public class Party<E extends Party<E>> extends PartyPlaceThing<E> {

    public Party(EntityIdentifier<E> anIdentifier, Name aName) {
        super(anIdentifier, aName);
    }

    protected Party() {

    }
}
