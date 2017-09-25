package org.venuspj.studio.generic.fundamentals.geographic;

import org.venuspj.ddd.model.value.ValueObject;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class MapPosition implements ValueObject {

    private final Latitude latitude;
    private final Longitude longitude;

    public MapPosition(Latitude aLatitude, Longitude aLongitude) {
        this.latitude = aLatitude;
        ;
        this.longitude = aLongitude;
    }

    public boolean isEmpty() {
        return latitude.isUndefined() || longitude.isUndefined();
    }

    public String toMapQuery() {
        return String.format("%s,%s", latitude.toString(), longitude.toString());
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("latitude", latitude)
                .add("longitude", longitude)
                .toString();
    }

    public static MapPosition emptyMapPosition() {
        return new MapPosition(Latitude.emptyLatitude(),Longitude.emptyLongitude());
    }
}
