package org.venuspj.studio.generic.fundamentals.address.city;

/**
 */
public class CityMock {
    public static City createDummy(CityType aCityType) {
        return new City(aCityType.cityName());
    }

    public enum CityType {
        KAWASAKI_SAIWAI {
            @Override
            public String cityName() {
                return "川崎市幸区";
            }
        };

        public abstract String cityName();
    }
}
