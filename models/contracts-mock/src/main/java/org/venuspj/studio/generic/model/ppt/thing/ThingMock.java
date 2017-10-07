package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.UUID;

public class ThingMock {
    public static Thing createDummy(ThingType aThingType) {
        return new ThingImpl(aThingType.getIdentifier(),
                ThingInfoMock.createDummy(ThingInfoMock.ThingInfoType.EMPTY));
    }

    public enum ThingType {
        PRPDUCT1 {
            @Override
            public EntityIdentifier<Thing> getIdentifier() {
                return new DefaultEntityIdentifier<Thing>(Thing.class, UUID.fromString("1"));
            }
        }, PRPDUCT2 {
            @Override
            public EntityIdentifier<Thing> getIdentifier() {
                return new DefaultEntityIdentifier<Thing>(Thing.class, UUID.fromString("2"));
            }
        };

        public abstract EntityIdentifier<Thing> getIdentifier();
    }
}
