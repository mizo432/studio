package org.venuspj.studio.generic.model.ppt;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class PartyPlaceThing {
    PartyPlaceThingId personPlaceThingId;
    Name name;

    public PartyPlaceThing(PartyPlaceThingId aPersonPlaceThingId, Name aName) {
        personPlaceThingId = aPersonPlaceThingId;
        name = aName;
    }

    protected PartyPlaceThing() {

    }


    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("personPlaceThingId", personPlaceThingId)
                .add("name", name)
                .omitNullValues()
                .toString();
    }

}
