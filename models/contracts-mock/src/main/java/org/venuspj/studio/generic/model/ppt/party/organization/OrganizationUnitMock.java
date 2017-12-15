package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifierMock;

public class OrganizationUnitMock {
    public static OrganizationUnit create(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        DEEJEY1 {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.DEEJEY1))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.DEEJEY1))
                        .build();
            }
        }, DEEJEY2 {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.DEEJEY2))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.DEEJEY2))
                        .build();

            }
        }, DEEJEY3 {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.DEEJEY3))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.DEEJEY3))
                        .build();
            }
        }, SOUND1 {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.SOUND1))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.SOUND1))
                        .build();
            }
        }, SOUND2 {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.SOUND2))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.SOUND2))
                        .build();
            }
        }, DEEJEY4_OUTER {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.DEEJEY4_OUTER))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.OUTER))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.DEEJEY4_OUTER))
                        .build();
            }
        }, SOUND3_OUTER {
            @Override
            public OrganizationUnit create() {
                return new OrganizationUnitImpl.Builder()
                        .withIdentifier(PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.SOUND3_OUTER))
                        .withOrganization(OrganizationMock.create(OrganizationMock.MockType.OUTER))
                        .withOrganizationUnitInformation(OrganizationUnitInformationMock.create(OrganizationUnitInformationMock.MockType.SOUND3_OUTER))
                        .build();
            }
        };

        public abstract OrganizationUnit create();
    }
}
