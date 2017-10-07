package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitMock;

public class PlayerMock {
    public static Player createDummy(PlayerType aPlayerType) {
        if (aPlayerType == PlayerType.EMPTY)
            return Player.emptyPlayer();
        return new Player(OrganizationUnitMock.createDimmy(aPlayerType.getOrganizationUnitType().EMPTY), aPlayerType.getPlayerClassification(), aPlayerType.getPlayerInfo());
    }

    public enum PlayerType {
        DEEJEY1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.DEEJEY1;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, DEEJEY2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.DEEJEY2;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, DEEJEY3 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.DEEJEY3;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, SOUND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.STUDIO_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.SOUND1;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, EMPTY {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.NULL_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.EMPTY;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, OUTER_BAND1 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.OUTER_BAND1;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        }, OUTER_BAND2 {
            @Override
            public PlayerClassification getPlayerClassification() {
                return PlayerClassification.OUTER_PLAYER;
            }

            @Override
            public OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType() {
                return OrganizationUnitMock.OrganizationUnitType.OUTER_BAND2;
            }

            @Override
            public PlayerInfo getPlayerInfo() {
                return PlayerInfoMock.createDummy(PlayerInfoMock.PlayerInfoType.DEEJEY1);
            }
        };

        public abstract PlayerClassification getPlayerClassification();


        public abstract OrganizationUnitMock.OrganizationUnitType getOrganizationUnitType();

        public abstract PlayerInfo getPlayerInfo();
    }
}
