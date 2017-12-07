package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.model.ppt.party.PartyMock;

public class PlayerMock {
    public static Player createDummy(PlayerMockType aMockType) {
        return aMockType.create();
    }

    public enum PlayerMockType {
        DEEJEY1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }


            @Override
            public Player create() {
                return new Player(PartyMock.createMock(PartyMock.PartyMockType.DEEJEY1),
                        PlayerInformationMock.createDummy(PlayerInformationMock.PlayerInformationMockType.DEEJEY1));
            }
        }, DEEJEY2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public Player create() {
                return null;
            }
        }, DEEJEY3 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public Player create() {
                return null;
            }
        }, SOUND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public Player create() {
                return null;
            }
        }, EMPTY {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.NULL_PLAYER;
            }

            @Override
            public Player create() {
                return null;
            }
        }, OUTER_BAND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }

            @Override
            public Player create() {
                return Player.empty();
            }

        }, OUTER_BAND2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }

            @Override
            public Player create() {
                return null;
            }
        };

        public abstract PlayerClassification getPlayerClassification();


        public abstract Player create();
    }
}
