package org.venuspj.studio.core.fundamentals.telNo;

/**
 */
public class TelNoMock {
    public static TelNo createDummy(TelNoType aTelNoType) {
        return new TelNo(aTelNoType.number());
    }

    public enum TelNoType {
        EMPTY {
            @Override
            public String number() {
                return null;
            }
        }, EXISTS_NUMBER {
            @Override
            public String number() {
                return "0120-222-1234";
            }
        };

        public abstract String number();
    }

}
