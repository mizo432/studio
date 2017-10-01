package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitMock;

public class PlayerMock {
    public static Player createDummy(PlayerType aPlayerType) {
        if (aPlayerType == PlayerType.EMPTY)
            return Player.emptyPlayer();
        return new Player(OrganizationUnitMock.createDimmy(OrganizationUnitMock.OrganizationUnitType.EMPTY), aPlayerType.getPlayerClassification());
    }

    public enum PlayerType {
        DEEJEY2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }
        }, DEEJEY3 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }
        }, SOUND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }
        }, DEEJEY1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }
        }, EMPTY {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.NULL_PLAYER;
            }
        }, OUTER_BAND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }
        }, OUTER_BAND2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }
        };

        public abstract PlayerClassification getPlayerClassification();
    }
}
