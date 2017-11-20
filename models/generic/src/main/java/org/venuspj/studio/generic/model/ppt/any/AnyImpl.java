package org.venuspj.studio.generic.model.ppt.any;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

public class AnyImpl extends PartyPlaceThingImpl<AnyImpl> {
    public AnyImpl(EntityIdentifier<AnyImpl> anIdentifier) {
        super(anIdentifier);
    }
}
