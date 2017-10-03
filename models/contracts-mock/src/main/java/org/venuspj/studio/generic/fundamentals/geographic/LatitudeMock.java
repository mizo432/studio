package org.venuspj.studio.generic.fundamentals.geographic;

public class LatitudeMock {
    public static Latitude createDummy(LatitudeType aLatitudeType) {
        return new Latitude(aLatitudeType.getValue());
    }

    public enum LatitudeType {
        SAKAWAGAWA {
            @Override
            public String getValue() {
                return "139.1114";
            }
        };

        public abstract String getValue();
    }
}
