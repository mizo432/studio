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
                return new Performer.Builder()
                        .withParty(PartyMock.createMock(PartyMock.MockType.DEEJEY1))
                        .withPerformerInformation(PerformerInfoMock.createDummy(PerformerInfoMock.PerformerInfoType.DEEJEY1_EVENT1))
                        .build();
            }
        };

        public Performer getPerformer() {
            return Performer.empty();
        }
    }
}
