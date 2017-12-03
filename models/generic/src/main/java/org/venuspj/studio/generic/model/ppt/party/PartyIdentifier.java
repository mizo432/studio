package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyIdentifier extends AbstractEntityIdentifier<Party> {
    private final Integer value;

    PartyIdentifier() {
        super(Party.class);
        value = null;
    }

    public PartyIdentifier(Integer aValue) {
        super(Party.class);
        value = aValue;
    }

    public static PartyIdentifier newId() {
        return new PartyIdentifier();
    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }
}
