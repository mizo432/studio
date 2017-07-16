package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.address.Address;

/**
 */
public class AddressMock {
    public static Address createDummy(AddressType anAddressType) {
        return new Address(PrefectureMock.createDummy(PrefectureMock.PrefectureType.KANAGAWA),
                CityMock.createDummy(CityMock.CityType.KAWASAKI_SAIWAI),
                AddressStringMock.createDummy(AddressStringMock.AddressStringType.EMPTY));
    }

    public enum AddressType {
        DEFAULT

    }
}
