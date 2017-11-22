package org.venuspj.studio.generic.model.ppt.any;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

public class AnyImpl<A extends Any<A>> extends PartyPlaceThingImpl<A> implements Any<A> {
    public AnyImpl(EntityIdentifier<A> anIdentifier) {
        super(anIdentifier);
    }
}
