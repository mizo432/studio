package org.venuspj.studio.generic.model.ppt.party.organization;

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
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.LHS))
                        .build();
            }

        }, DEEJEY1 {
            @Override
            public OrganizationInformation create() {
                return new OrganizationInformation
                        .Builder()
                        .withAddressUse(AddressUseMock.createDummy(AddressUseMock.MockType.VENUE1))
                        .build();
            }
        };

        public abstract OrganizationInformation create();
    }
}
