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
        }, YOKOHAMA_TOSUKA {
            @Override
            public String getCityName() {
                return "横浜市戸塚区";
            }
        }, SHINJYUKU {
            @Override
            public String getCityName() {
                return "新宿区";
            }
        }, SHIBUYA {
            @Override
            public String getCityName() {
                return "渋谷区";
            }
        };

        public abstract String getCityName();
    }
}
