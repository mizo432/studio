package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationMock;

public class PartyMock {
    public static Party createMock(PartyMockType aMockType) {
        return aMockType.create();
    }

    public enum PartyMockType {
        LIONHOUSE_STUDIO, DEEJEY1;

        public Party create() {
            return OrganizationMock.createDimmy(OrganizationMock.OrganizationMockType.LIONHOUSE_STUDIO);
        }
    }
}
