package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.fundamentals.place.Place;


/**
 */
public class PlaceMock {
    public static Place createDummy(PlaceType aPlaceType) {
        return new Place(DescriptorMock.createDummy(DescriptorMock.DescriptorType.DEFAULT),
                AddressMock.createDummy(AddressMock.AddressType.DEFAULT),
                ContactMock.createDummy(ContactMock.ContactType.EMPTY),
                SnsContactsMock.createDummy(SnsContactsMock.SnsContactsType.ONLY_HOME_PAGE));
    }

    public enum PlaceType {
        EMPTY

    }
}
