package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class OrganizationMock {
    public static Organization createDimmy(OrganizationMockType aMockType) {
        return aMockType.createMock();
    }

    public enum OrganizationMockType {
        LIONHOUSE_STUDIO {
            @Override
            public Organization createMock() {
                return new OrganizationImpl(
                        new PartyIdentifier(1),
                        OrganizationInfo.empty(),
                        OrganizationUnits.empty()
                );
            }
        };

        public abstract Organization createMock();
    }
}
