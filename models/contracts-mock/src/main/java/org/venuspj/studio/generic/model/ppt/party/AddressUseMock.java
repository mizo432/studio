package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.fundamentals.address.AddressMock;

public class AddressUseMock {
    public static AddressUse createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        VENUE1 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(2))
                        .withPartyIds(PartyIds.emptyPartyIds())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.VENUE1))
                        .build();
            }
        }, LHS {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(1))
                        .withPartyIds(PartyIds.emptyPartyIds())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        };

        public abstract AddressUse create();
    }
}
