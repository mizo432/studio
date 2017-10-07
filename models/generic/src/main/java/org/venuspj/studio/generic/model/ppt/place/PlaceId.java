package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class PlaceId {
    public static EntityIdentifier<Place> emptyThingId() {
        return DefaultEntityIdentifier.emptyIdentifier(Place.class);
    }
}
