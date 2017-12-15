package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;

import static org.venuspj.util.objects2.Objects2.isNull;

public class PlaceIdentifier extends AbstractEntityIdentifier<Place> {

    private final Integer value;

    PlaceIdentifier() {
        super(Party.class);
        value = null;
    }

    public PlaceIdentifier(Integer aValue) {
        super(Party.class);
        value = aValue;
    }

    public static PlaceIdentifier newId() {
        return new PlaceIdentifier();
    }

    @Override
    public boolean isEmpty() {
        return isNull(value);
    }

    public static PlaceIdentifier empty() {
        return newId();
    }
}
