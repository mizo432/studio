package org.venuspj.studio.generic.model.ppt;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyPlaceThingIdentifier<PPTI extends PartyPlaceThing<PPTI>> extends AbstractEntityIdentifier<PPTI> {

    private final Integer value;

    PartyPlaceThingIdentifier(Class<? extends PartyPlaceThingIdentifier> aClass, Integer aValue) {
        super(aClass);
        value = aValue;

    }

    PartyPlaceThingIdentifier(Class<? extends PartyPlaceThingIdentifier> aClass) {
        super(aClass);
        value = null;

    }

    PartyPlaceThingIdentifier() {
        super(PartyPlaceThing.class);
        value = null;

    }

    PartyPlaceThingIdentifier(Integer aValue) {
        super(PartyPlaceThing.class);
        value = aValue;

    }

    @Override
    public boolean equals(Object o) {
        return nonNull(o) &&
                (this == o ||
                        (o instanceof PartyPlaceThingIdentifier &&
                                (equal(((PartyPlaceThingIdentifier) o).value, value) &&
                                        (equal(((PartyPlaceThingIdentifier) o).kind, kind)))));
    }

    @Override
    public int hashCode() {
        return hash(kind, value);
    }

    public boolean sameValueAs(PartyPlaceThingIdentifier anIdentifier) {
        return equals(anIdentifier);
    }
}
