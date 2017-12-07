package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class OrganizationMock {
    public static Organization createDimmy(MockType aMockType) {
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
        };

        public abstract Organization createMock();
    }
}
