package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.address.city.City;

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
