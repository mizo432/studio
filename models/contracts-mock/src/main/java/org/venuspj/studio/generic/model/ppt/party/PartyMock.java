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
                return OrganizationMock.create(OrganizationMock.MockType.LIONHOUSE_STUDIO);
            }
        }, DEEJEY1 {
            @Override
            public Party create() {
                return OrganizationMock.create(OrganizationMock.MockType.DEEJEY1);
            }
        }, DEEJEY2 {
            @Override
            public Party create() {
                return OrganizationMock.create(OrganizationMock.MockType.DEEJEY2);
            }
        }, DEEJEY3 {
            @Override
            public Party create() {
                return OrganizationMock.create(OrganizationMock.MockType.DEEJEY3);
            }
        }, SOUND1 {
            @Override
            public Party create() {
                return OrganizationMock.create(OrganizationMock.MockType.SOUND1);
            }
        }, SOUND2 {
            @Override
            public Party create() {
                return OrganizationMock.create(OrganizationMock.MockType.SOUND2);
            }
        };

        public abstract Party create();
    }
}
