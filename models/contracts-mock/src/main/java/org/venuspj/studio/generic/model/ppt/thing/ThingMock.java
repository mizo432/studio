package org.venuspj.studio.generic.model.ppt.thing;

public class ThingMock {
    public static Thing createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        PRODUCT1 {
            @Override
            public ThingIdentifier getIdentifier() {
                return new ThingIdentifier(1);
            }

            @Override
            public Thing create() {
                return new ThingImpl(getIdentifier(),
                        ThingInfoMock.createDummy(ThingInfoMock.ThingInfoType.EMPTY));
            }
        }, PRODUCT2 {
            @Override
            public ThingIdentifier getIdentifier() {
                return new ThingIdentifier(2);
            }

            @Override
            public Thing create() {
                return new ThingImpl(getIdentifier(),
                        ThingInfoMock.createDummy(ThingInfoMock.ThingInfoType.EMPTY));
            }
        };

        public abstract ThingIdentifier getIdentifier();

        public abstract Thing create();
    }
}
