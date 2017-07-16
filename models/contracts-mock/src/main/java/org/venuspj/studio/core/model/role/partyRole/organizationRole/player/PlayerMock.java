package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.NameMock;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class PlayerMock {
    public static Player createDummy(PlayerType aPlayerType) {
        return new Player(PlayerIdMock.createDummy(aPlayerType.playerIdType()), NameMock.createDummy(aPlayerType.nameType()), PlayerClassification.STUDIO_PLAYER);
    }

    public enum PlayerType {
        DEEJEY1 {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.DEEJEY1;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER1;
            }
        }, DEEJEY2 {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.DEEJEY2;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER2;
            }
        }, SOUND1 {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.SOUND1;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER3;
            }
        }, SOUND2 {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.SOUND2;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER4;
            }
        };

        public abstract PlayerIdMock.PlayerIdType playerIdType();

        public abstract NameMock.NameType nameType();
    }

}
