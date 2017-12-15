package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.fundamentals.name.NameMock;
import org.venuspj.studio.generic.model.ppt.party.AddressUseMock;

public class OrganizationUnitInformationMock {
    public static OrganizationUnitInformation create(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        DEEJEY1 {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER1))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY1))
                        .build();
            }
        }, DEEJEY2 {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER2))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY2))
                        .build();
            }
        }, DEEJEY3 {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER3))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY3))
                        .build();
            }
        }, SOUND1 {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER4))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.SOUND1))
                        .build();
            }
        }, SOUND2 {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER5))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.SOUND2))
                        .build();
            }
        }, DEEJEY4_OUTER {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER6))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY4_OUTER))
                        .build();
            }
        }, SOUND3_OUTER {
            @Override
            public OrganizationUnitInformation create() {
                return new OrganizationUnitInformation.Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER7))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.SOUND3_OUTER))
                        .build();
            }
        };

        public abstract OrganizationUnitInformation create();
    }
}
