package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.uuidProvider.UuidProvider;

public class ThingMock {
    public static Thing createDummy(ThingType aThingType) {
        return new ThingImpl(aThingType.getIdentifier(),
                ThingInfoMock.createDummy(ThingInfoMock.ThingInfoType.EMPTY));
    }

    public enum ThingType {
        PRPDUCT1 {
            @Override
            public EntityIdentifier<Thing> getIdentifier() {
                return new DefaultEntityIdentifier<>(Thing.class, UuidProvider.randomUUID());
            }
        }, PRPDUCT2 {
            @Override
            public EntityIdentifier<Thing> getIdentifier() {
                return new DefaultEntityIdentifier<>(Thing.class, UuidProvider.randomUUID());
            }
        };

        public abstract EntityIdentifier<Thing> getIdentifier();
    }
}
