package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifierMock;

public class OrganizationMock {
    public static Organization create(MockType aMockType) {
        return aMockType.createMock();
    }

    public enum MockType {
        LIONHOUSE_STUDIO {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.LHS),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.LHS),
                        OrganizationUnitIdentifiers.empty()
                );
            }
        }, OUTER {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        PartyIdentifierMock.createDummy(PartyIdentifierMock.MockType.OUTER),
                        OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.OUTER),
                        OrganizationUnitIdentifiers.empty()
                );
            }
        };

        public abstract Organization createMock();
    }
}
