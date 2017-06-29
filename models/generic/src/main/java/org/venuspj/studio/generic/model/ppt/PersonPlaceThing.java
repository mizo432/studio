package org.venuspj.studio.generic.model.ppt;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class PersonPlaceThing {
    PersonPlaceThingId personPlaceThingId;
    Name name;

    public PersonPlaceThing(PersonPlaceThingId aPersonPlaceThingId, Name aName) {
        personPlaceThingId = aPersonPlaceThingId;
        name = aName;
    }

    PersonPlaceThing() {

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
