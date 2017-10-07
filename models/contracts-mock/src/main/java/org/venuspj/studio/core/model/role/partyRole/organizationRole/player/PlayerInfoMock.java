package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.NameMock;

public class PlayerInfoMock {
    public static PlayerInfo createDummy(PlayerInfoType aPlayerInfoType) {
        return aPlayerInfoType.getPlayerInfo();
    }

    public enum PlayerInfoType {
        DEEJEY1 {
            @Override
            public PlayerInfo getPlayerInfo() {
                return new PlayerInfo(NameMock.createDummy(NameMock.NameType.PLAYER1));
            }
        };

        public abstract PlayerInfo getPlayerInfo();
    }
}
