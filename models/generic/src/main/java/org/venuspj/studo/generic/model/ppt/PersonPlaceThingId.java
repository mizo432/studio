package org.venuspj.studo.generic.model.ppt;

import org.venuspj.util.objects2.Objects2;

import java.util.UUID;

public class PersonPlaceThingId {
    String value;

    PersonPlaceThingId() {

    }

    public PersonPlaceThingId(String aValue) {
        value = aValue;

    }

    public static PersonPlaceThingId newId() {
        return new PersonPlaceThingId(UUID.randomUUID().toString());
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    public static PersonPlaceThingId empty() {
        return new PersonPlaceThingId();
    }
}
