package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.PartyMock;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;

/**
 */
public class StudioMock {

    public static Studio createDummy(StudioMockType aMockType) {
        return aMockType.create();
    }

    public enum StudioMockType {
        EMPTY {
            @Override
            public Studio create() {
                return null;
            }
        }, LHS {
            @Override
            public Studio create() {
                return new Studio((Organization) PartyMock.createMock(PartyMock.PartyMockType.LIONHOUSE_STUDIO), null);
            }
        };

        public abstract Studio create();

    }
}
