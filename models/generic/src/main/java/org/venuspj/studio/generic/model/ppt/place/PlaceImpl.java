package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class PlaceImpl extends AbstractEntity<Place> implements Place {
    PlaceInfo placeInfo;

    public PlaceImpl(EntityIdentifier<Place> anIdentifier, PlaceInfo aPlaceInfo) {
        super(anIdentifier);
        placeInfo = aPlaceInfo;
    }

    public static Place emptyPlace() {
        return new PlaceImpl(PlaceIdentifier.empty(), PlaceInfo.empty());
    }

}
