package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.NameMock;

public class PlayerInformationMock {
    public static PlayerInformation createDummy(PlayerInformationMockType aMockType) {
        return aMockType.create();
    }

    public enum PlayerInformationMockType {
        DEEJEY1 {
            @Override
            public PlayerInformation create() {
                return new PlayerInformation(NameMock.createDummy(NameMock.NameType.PLAYER1), PlayerClassification.STUDIO_PLAYER);
            }
        };


        public abstract PlayerInformation create();
    }
}
