package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationMock;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitMock;

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
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.DEEJEY1);
            }
        }, DEEJEY2 {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.DEEJEY2);
            }
        }, DEEJEY3 {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.DEEJEY3);
            }
        }, SOUND1 {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.SOUND1);
            }
        }, SOUND2 {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.SOUND2);
            }
        }, DEEJEY4_OUTER {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.DEEJEY4_OUTER);
            }
        }, SOUND3_OUTER {
            @Override
            public Party create() {
                return OrganizationUnitMock.create(OrganizationUnitMock.MockType.SOUND3_OUTER);
            }
        };

        public abstract Party create();
    }
}
