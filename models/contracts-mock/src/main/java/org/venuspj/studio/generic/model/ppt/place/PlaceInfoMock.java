package org.venuspj.studio.generic.model.ppt.place;

import org.venuspj.studio.generic.fundamentals.address.AddressMock;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class PlaceInfoMock {
    public static PlaceInformation createDummy(PlaceInfoType aPlaceInfoType) {
        return new PlaceInformation(new Name(aPlaceInfoType.name()), AddressMock.createDummy(aPlaceInfoType.addressType()));
    }

    public enum PlaceInfoType {
        VENUE1 {
            @Override
            public AddressMock.MockType addressType() {
                return AddressMock.MockType.VENUE1;
            }
        };

        public abstract AddressMock.MockType addressType();
    }
}
