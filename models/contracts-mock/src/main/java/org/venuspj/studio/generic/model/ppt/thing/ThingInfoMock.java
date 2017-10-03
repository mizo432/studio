package org.venuspj.studio.generic.model.ppt.thing;

public class ThingInfoMock {
    public static ThingInfo createDummy(ThingInfoType aThingInfoType) {
        return new ThingInfo();
    }

    public enum ThingInfoType {
        EMPTY

    }

}
