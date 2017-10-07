package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerMock;

public class PerformerMock {
    public static Performer createDummy(PerformerType aPerformerType) {
        return aPerformerType.getPerformer();
    }

    public enum PerformerType {
        EMPTY,
        DEEJEY1_EVENT1 {
            @Override
            public Performer getPerformer() {
                return new Performer(
                        PlayerMock.createDummy(PlayerMock.PlayerType.DEEJEY1),
                        PerformerInfoMock.createDummy(PerformerInfoMock.PerformerInfoType.DEEJEY1_EVENT1)
                );
            }
        };

        public Performer getPerformer() {
            return Performer.emptyPerformer();
        }
    }
}
