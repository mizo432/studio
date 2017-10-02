package org.venuspj.studio.generic.fundamentals.address.city;

/**
 */
public class CityMock {
    public static City createDummy(CityType aCityType) {
        return new City(aCityType.getCityName());
    }

    public enum CityType {
        KAWASAKI_SAIWAI {
            @Override
            public String getCityName() {
                return "川崎市幸区";
            }
        }, ODAWARA {
            @Override
            public String getCityName() {
                return "小田原市";
            }
        };

        public abstract String getCityName();
    }
}
