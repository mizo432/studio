package org.venuspj.studio.generic.fundamentals.address;

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
