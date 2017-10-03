package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.util.uuidProvider.UuidProvider;

import static org.venuspj.util.objects2.Objects2.*;

public class PlaceId extends AbstractEntityIdentifier<Place> {
    private String value;

    public PlaceId(String aValue) {
        super(Place.class);
        value = aValue;

    }

    public static PlaceId newPlaceId() {
        return new PlaceId(UuidProvider.randomUUID().toString());
    }

    public static PlaceId emptyThingId() {
        return new PlaceId(null);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("kind", kind)
                .add("value", value)
                .omitNullValues()
                .toString();
    }
}
