package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.model.ppt.PartyPlaceThingImpl;

public class PlaceImpl extends PartyPlaceThingImpl<Place> implements Place {

    public PlaceImpl(PlaceIdentifier anIdentifier, PlaceInformation aPlaceInformation) {
        super(anIdentifier, aPlaceInformation);
    }

    public static Place emptyPlace() {
        return new PlaceImpl(PlaceIdentifier.empty(), PlaceInformation.empty());
    }

}
