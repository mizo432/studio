package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.PartyPlaceThingId;

public class PartyId<E extends Party<E>> extends PartyPlaceThingId<E> {
    protected PartyId() {
        this(Party.class);

    }

    protected PartyId(Class<?> anEntityClass) {
        super(anEntityClass);

    }

    protected PartyId(Class<?> anEntityClass, String aValue) {
        super(anEntityClass, aValue);

    }

    public PartyId(String aValue) {
        super(Party.class, aValue);

    }

    public static PartyId empty() {
        return new PartyId();
    }

}
