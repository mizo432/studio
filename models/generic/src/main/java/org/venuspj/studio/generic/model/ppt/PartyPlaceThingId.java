package org.venuspj.studio.generic.model.ppt;

import org.venuspj.util.objects2.Objects2;

import java.util.UUID;

public class PartyPlaceThingId {
    String value;

    PartyPlaceThingId() {

    }

    public PartyPlaceThingId(String aValue) {
        value = aValue;

    }

    public static PartyPlaceThingId newId() {
        return new PartyPlaceThingId(UUID.randomUUID().toString());
    }

    public static PartyPlaceThingId empty() {
        return new PartyPlaceThingId();
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
}
