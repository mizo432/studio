package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.fundamentals.address.AddressMock;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class PlaceInfoMock {
    public static PlaceInfo createDummy(PlaceInfoType aPlaceInfoType) {
        return new PlaceInfo(new Name(aPlaceInfoType.name()), AddressMock.createDummy(aPlaceInfoType.addressType()));
    }

    public enum PlaceInfoType {
        VENUE1 {
            @Override
            public AddressMock.AddressType addressType() {
                return AddressMock.AddressType.VENUE1;
            }
        };

        public abstract AddressMock.AddressType addressType();
    }
}
