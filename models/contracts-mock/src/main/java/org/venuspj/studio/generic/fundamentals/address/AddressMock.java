package org.venuspj.studio.generic.fundamentals.address;

import org.venuspj.studio.generic.fundamentals.address.city.CityMock;
import org.venuspj.studio.generic.fundamentals.geographic.MapPosition;
import org.venuspj.studio.generic.fundamentals.geographic.MapPositionMock;

/**
 */
public class AddressMock {
    public static Address createDummy(MockType anMockType) {
        return anMockType.getAddress();
    }

    public enum MockType {
        /**
         *
         */
        VENUE1 {
            @Override
            public Address getAddress() {
                return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.KANAGAWA),
                        CityMock.createDummy(CityMock.CityType.ODAWARA),
                        AddressStringMock.createDummy(AddressStringMock.AddressStringType.SAKAWAGAWA),
                        MapPositionMock.createDummy(MapPositionMock.MapPositionType.SAKAWAGAWA));
            }
        }, DEFAULT {
            @Override
            public Address getAddress() {
                return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.KANAGAWA),
                        CityMock.createDummy(CityMock.CityType.KAWASAKI_SAIWAI),
                        AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY), MapPosition.emptyMapPosition());
            }
        }, VENUE2 {
            @Override
            public Address getAddress() {
                return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.KANAGAWA),
                        CityMock.createDummy(CityMock.CityType.YOKOHAMA_TOSUKA),
                        AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY), MapPosition.emptyMapPosition());
            }
        }, VENUE3 {
            @Override
            public Address getAddress() {
                return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.TOKYO),
                        CityMock.createDummy(CityMock.CityType.SHINJYUKU),
                        AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY), MapPosition.emptyMapPosition());
            }
        }, VENUE4 {
            @Override
            public Address getAddress() {
                return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.TOKYO),
                        CityMock.createDummy(CityMock.CityType.SHIBUYA),
                        AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY), MapPosition.emptyMapPosition());
            }
        };

        public abstract Address getAddress();
    }
}
