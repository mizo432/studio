package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PlayersMock {
    public static Players createDummy(PlayersType anyPlayersType) {
        PlayerMock.PlayerType[] playerTypes = anyPlayersType.getPlayerTypes();
        List<Player> result = newArrayList();
        for (PlayerMock.PlayerType playerType : playerTypes)
            result.add(PlayerMock.createDummy(playerType));
        return new Players(result);
    }

    public enum PlayersType {
        ANY_PLAYERS {
            @Override
            public PlayerMock.PlayerType[] getPlayerTypes() {
                return new PlayerMock.PlayerType[]{
                        PlayerMock.PlayerType.DEEJEY1,
                        PlayerMock.PlayerType.DEEJEY2,
                        PlayerMock.PlayerType.DEEJEY3,
                        PlayerMock.PlayerType.SOUND1};
            }
        }, ONE_DEEJEY {
            @Override
            public PlayerMock.PlayerType[] getPlayerTypes() {
                return new PlayerMock.PlayerType[]{
                        PlayerMock.PlayerType.DEEJEY1};
            }
        }, ALL_PLAYERS {
            @Override
            public PlayerMock.PlayerType[] getPlayerTypes() {
                return new PlayerMock.PlayerType[]{
                        PlayerMock.PlayerType.DEEJEY1,
                        PlayerMock.PlayerType.DEEJEY2,
                        PlayerMock.PlayerType.DEEJEY3,
                        PlayerMock.PlayerType.SOUND1,
                        PlayerMock.PlayerType.OUTER_BAND1,
                        PlayerMock.PlayerType.OUTER_BAND2};
            }
        }, OUTER_PLAYERS {
            @Override
            public PlayerMock.PlayerType[] getPlayerTypes() {
                return new PlayerMock.PlayerType[]{
                        PlayerMock.PlayerType.OUTER_BAND1,
                        PlayerMock.PlayerType.OUTER_BAND2};
            }
        };

        public abstract PlayerMock.PlayerType[] getPlayerTypes();
    }
}
