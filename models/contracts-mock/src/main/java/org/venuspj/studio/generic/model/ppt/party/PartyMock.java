package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationMock;

public class PartyMock {
    public static Party createMock(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        LIONHOUSE_STUDIO {
            @Override
            public Party create() {
                return OrganizationMock.createDimmy(OrganizationMock.MockType.LIONHOUSE_STUDIO);
            }
        }, DEEJEY1 {
            @Override
            public Party create() {
                return OrganizationMock.createDimmy(OrganizationMock.MockType.DEEJEY1);
            }
        };

        public abstract Party create();
    }
}
