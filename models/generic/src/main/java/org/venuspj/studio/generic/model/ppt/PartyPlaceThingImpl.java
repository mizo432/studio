package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class PartyPlaceThingImpl<PPTI extends PartyPlaceThingImpl<PPTI>> extends AbstractEntity<PPTI> implements PartyPlaceThing<PPTI> {
    public PartyPlaceThingImpl(EntityIdentifier<PPTI> anIdentifier) {
        super(anIdentifier);
    }

}
