package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.fundamentals.name.NameMock;
import org.venuspj.studio.generic.model.ppt.party.AddressUseMock;

public class OrganizationInformationMock {
    public static OrganizationInformation createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        LHS {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.STUDIO_NAME))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.LHS))
                        .build();
            }

        }, DEEJEY1 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withName(NameMock.createDummy(NameMock.NameType.PLAYER1))
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY1))
                        .build();
            }
        }, DEEJEY2 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY2))
                        .build();
            }
        }, DEEJEY3 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.DEEJEY3))
                        .build();
            }
        }, SOUND1 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.SOUND1))
                        .build();
            }
        }, SOUND2 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.SOUND2))
                        .build();
            }
        }, OUTER {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .build();
            }
        };

        public abstract OrganizationInformation create();
    }
}
