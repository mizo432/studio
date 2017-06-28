package org.venuspj.studo.generic.model.ppt;

import org.venuspj.util.objects2.Objects2;

public class PersonPlaceThing {
    PersonPlaceThingId personPlaceThingId;

    PersonPlaceThing() {
    }

    public PersonPlaceThing(PersonPlaceThingId aPersonPlaceThingId) {
        personPlaceThingId = aPersonPlaceThingId;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("personPlaceThingId", personPlaceThingId)
                .omitNullValues()
                .toString();
    }
}
