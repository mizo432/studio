package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.PartyMock;
import org.venuspj.studio.generic.model.ppt.party.organization.Organization;

/**
 */
public class StudioMock {

    public static Studio createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        EMPTY {
            @Override
            public Studio create() {
                return Studio.empty();
            }
        }, LHS {
            @Override
            public Studio create() {
                return new Studio(
                        (Organization) PartyMock.createMock(PartyMock.MockType.LIONHOUSE_STUDIO),
                        StudioInformationMock.createDummy(StudioInformationMock.MockType.LHS));
            }
        };

        public abstract Studio create();

    }
}
