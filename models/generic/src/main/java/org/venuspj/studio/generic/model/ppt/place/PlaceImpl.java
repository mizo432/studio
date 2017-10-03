package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.ddd.model.entity.AbstractEntity;

import static org.venuspj.util.objects2.Objects2.*;

public class PlaceImpl extends AbstractEntity<Place> implements Place {
    PlaceId placeId;
    PlaceInfo placeInfo;

    public PlaceImpl(PlaceId anIdentifier, PlaceInfo aPlaceInfo) {
        super(anIdentifier);
        placeId = anIdentifier;
        placeInfo = aPlaceInfo;
    }

    public static Place emptyPlace() {
        return new PlaceImpl(PlaceId.emptyThingId(), PlaceInfo.emptyPlaceInfo());
    }

    @Override
    protected ToStringHelper string() {
        return toStringHelper(this)
                .add("placeId", placeId)
                .add("placeInfo", placeInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }
}
