package org.venuspj.studio.core.fundamentals.place;

import org.venuspj.studio.core.fundamentals.contact.ContactMock;
import org.venuspj.studio.core.model.event.flyers.DescriptorMock;
import org.venuspj.studio.core.model.event.flyers.SnsContactsMock;
import org.venuspj.studio.generic.fundamentals.address.AddressMock;


/**
 */
@Deprecated
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
