package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class PartyIdentifier<P extends Party<P>> extends AbstractEntityIdentifier<P> {
    private final Integer value;

    PartyIdentifier() {
        super(Party.class);
        value = null;
    }

    PartyIdentifier(Integer aValue) {
        super(Party.class);
        value = aValue;
    }

}
