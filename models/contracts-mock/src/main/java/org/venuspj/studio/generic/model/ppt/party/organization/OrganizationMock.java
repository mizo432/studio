package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class OrganizationMock {
    public static Organization create(MockType aMockType) {
        return aMockType.createMock();
    }

    public enum MockType {
        LIONHOUSE_STUDIO {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.LHS),
                        OrganizationUnits.empty()
                );
            }
        }, DEEJEY1 {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.DEEJEY1),
                        OrganizationUnits.empty()
                );
            }
        }, DEEJEY2 {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.DEEJEY2),
                        OrganizationUnits.empty()
                );

            }
        }, DEEJEY3 {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.DEEJEY3),
                        OrganizationUnits.empty()
                );
            }
        }, SOUND1 {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.SOUND1),
                        OrganizationUnits.empty()
                );
            }
        }, SOUND2 {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.SOUND2),
                        OrganizationUnits.empty()
                );
            }
        };

        public abstract Organization createMock();
    }
}
