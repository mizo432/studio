package org.venuspj.studio.generic.fundamentals.address.city;

import org.venuspj.util.collect.Lists2;

import java.util.List;

public class CitiesMock {

    public static Cities createDummy(CitiesType aCitiesType) {
        List<City> cityList = Lists2.newArrayListWithExpectedSize(aCitiesType.cityCount());
        for (CityMock.CityType cityType : aCitiesType.cityTypes()) {
            cityList.add(CityMock.createDummy(cityType));
        }
        return new Cities(cityList);

    }

    public enum CitiesType {
        EMPTY {
            @Override
            public CityMock.CityType[] cityTypes() {
                return new CityMock.CityType[0];
            }
        }, DEFAULT {
            @Override
            public CityMock.CityType[] cityTypes() {
                return new CityMock.CityType[]{
                        CityMock.CityType.KAWASAKI_SAIWAI
                };
            }
        };

        public abstract CityMock.CityType[] cityTypes();

        public int cityCount() {
            return cityTypes().length;
        }
    }

}
