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
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.VENUE1))
                        .build();
            }
        }, VENUE2 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(3))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.VENUE2))
                        .build();
            }
        }, VENUE3 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(4))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.VENUE3))
                        .build();
            }
        }, VENUE4 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(5))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.VENUE4))
                        .build();
            }
        }, LHS {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(1))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, DEEJEY1 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(6))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, DEEJEY2 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(7))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, DEEJEY3 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(8))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, SOUND1 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(9))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, SOUND2 {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .withAddressUseIdentifier(new AddressUseIdentifier(10))
                        .withPartyIds(PartyIdentifiers.create())
                        .withAddress(AddressMock.createDummy(AddressMock.MockType.DEFAULT))
                        .build();
            }
        }, SOUND3_OUTER {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .build();
            }
        }, DEEJEY4_OUTER {
            @Override
            public AddressUse create() {
                return new AddressUse
                        .Builder()
                        .build();
            }
        };

        public abstract AddressUse create();
    }
}
