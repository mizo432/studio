package org.venuspj.studio.generic.model.ppt.thing;

import org.venuspj.studio.generic.fundamentals.name.NameMock;

public class ThingInfoMock {
    public static ThingInformation createDummy(ThingInfoType aThingInfoType) {
        return aThingInfoType.create();
    }

    public enum ThingInfoType {
        PRODUCT1 {
            @Override
            public ThingInformation create() {
                return new ThingInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.ALUBUM_NAME1))
                        .build();
            }
        }, PRODUCT2 {
            @Override
            public ThingInformation create() {
                return new ThingInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.ALUBUM_NAME2))
                        .build();
            }
        }, PRODUCT3 {
            @Override
            public ThingInformation create() {
                return new ThingInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.ALUBUM_NAME3))
                        .build();
            }
        }, PRODUCT4 {
            @Override
            public ThingInformation create() {
                return new ThingInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.TENUGUI_NAME1))
                        .build();
            }
        }, EMPTY {
            @Override
            public ThingInformation create() {
                return new ThingInformation();
            }
        };

        public abstract ThingInformation create();
    }

}
