package org.venuspj.studio.generic.fundamentals.address;

import org.venuspj.studio.generic.fundamentals.address.city.CityMock;
import org.venuspj.studio.generic.fundamentals.geographic.MapPosition;

/**
 */
public class AddressMock {
    public static Address createDummy(AddressType anAddressType) {
        return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.KANAGAWA),
                CityMock.createDummy(CityMock.CityType.KAWASAKI_SAIWAI),
                AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY), MapPosition.emptyMapPosition());
    }

    public enum AddressType {
        DEFAULT

    }
}
