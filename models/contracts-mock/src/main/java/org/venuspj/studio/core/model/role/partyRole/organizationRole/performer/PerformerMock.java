package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.studio.generic.model.ppt.party.PartyMock;

public class PerformerMock {
    public static Performer createDummy(PerformerType aPerformerType) {
        return aPerformerType.getPerformer();
    }

    public enum PerformerType {
        EMPTY,
        DEEJEY1_EVENT1 {
            @Override
            public Performer getPerformer() {
                return new Performer(PartyMock.createMock(PartyMock.PartyMockType.DEEJEY1),
                        PerformerInfoMock.createDummy(PerformerInfoMock.PerformerInfoType.DEEJEY1_EVENT1)
                );
            }
        };

        public Performer getPerformer() {
            return Performer.empty();
        }
    }
}
