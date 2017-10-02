package org.venuspj.studio.generic.fundamentals.geographic;

public class LongitudeMock {
    public static Longitude createDummy(LongitudeType aLongitudeType) {
        return new Longitude(aLongitudeType.getValue());
    }

    public enum LongitudeType {
        SAKAWAGAWA {
            @Override
            public String getValue() {
                return "35.1545";
            }
        };

        public abstract String getValue();

    }
}
