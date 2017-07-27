package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.NameMock;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class PlayerMock {
    public static Player createDummy(PlayerType aPlayerType) {
        return new Player(PlayerIdMock.createDummy(aPlayerType.playerIdType()), NameMock.createDummy(aPlayerType.nameType()), PlayerClassificationMock.createDummy(aPlayerType));
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

            @Override
            public String playerClassification() {
                return PlayerClassification.STUDIO_PLAYER.name();
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
            @Override
            public String playerClassification() {
                return PlayerClassification.STUDIO_PLAYER.name();
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
            @Override
            public String playerClassification() {
                return PlayerClassification.STUDIO_PLAYER.name();
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
            @Override
            public String playerClassification() {
                return PlayerClassification.STUDIO_PLAYER.name();
            }
        }, OUTER_DEEJEY {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.OUTER_DEEJEY;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER5;            }
            @Override
            public String playerClassification() {
                return PlayerClassification.OUTER_PLAYER.name();
            }
        }, OUTER_SOUND {
            @Override
            public PlayerIdMock.PlayerIdType playerIdType() {
                return PlayerIdMock.PlayerIdType.OUTER_SOUND;
            }

            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.PLAYER6;            }
            @Override
            public String playerClassification() {
                return PlayerClassification.OUTER_PLAYER.name();
            }
        };

        public abstract PlayerIdMock.PlayerIdType playerIdType();

        public abstract NameMock.NameType nameType();

        public abstract String playerClassification();
    }

}
