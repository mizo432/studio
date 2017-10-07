package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class ThingId {

    public static EntityIdentifier<Thing> newThingId() {
        return DefaultEntityIdentifier.newId(Thing.class);
    }

    public static EntityIdentifier<Thing> emptyThingId() {
        return DefaultEntityIdentifier.emptyIdentifier(Thing.class);
    }

}
