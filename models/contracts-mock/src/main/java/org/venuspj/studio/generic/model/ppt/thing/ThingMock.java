package org.venuspj.studio.generic.model.ppt.thing;

public class ThingMock {
    public static Thing createDummy(ThingType aThingType) {
        return new ThingImpl(aThingType.getIdentifier(),
                ThingInfoMock.createDummy(ThingInfoMock.ThingInfoType.EMPTY));
    }

    public enum ThingType {
        PRPDUCT1 {
            @Override
            public ThingId getIdentifier() {
                return new ThingId("1");
            }
        }, PRPDUCT2 {
            @Override
            public ThingId getIdentifier() {
                return new ThingId("2");
            }
        };

        public abstract ThingId getIdentifier();
    }
}
