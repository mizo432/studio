package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

public class PlayerClassificationMock {
    public static PlayerClassification createDummy(PlayerMock.PlayerType aPlayerType) {
        return PlayerClassification.valueOf(aPlayerType.playerClassification());
    }
}
