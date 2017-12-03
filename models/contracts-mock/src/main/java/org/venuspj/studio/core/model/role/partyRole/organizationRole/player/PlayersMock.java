package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PlayersMock {
    public static Players createDummy(PlayersMockType anyPlayersMockType) {
        PlayerMock.PlayerMockType[] playerTypes = anyPlayersMockType.getPlayerTypes();
        List<Player> result = newArrayList();
        for (PlayerMock.PlayerMockType playerType : playerTypes)
            result.add(PlayerMock.createDummy(playerType));
        return new Players(result);
    }

    public enum PlayersMockType {
        ANY_PLAYERS {
            @Override
            public PlayerMock.PlayerMockType[] getPlayerTypes() {
                return new PlayerMock.PlayerMockType[]{
                        PlayerMock.PlayerMockType.DEEJEY1,
                        PlayerMock.PlayerMockType.DEEJEY2,
                        PlayerMock.PlayerMockType.DEEJEY3,
                        PlayerMock.PlayerMockType.SOUND1};
            }
        }, ONE_DEEJEY {
            @Override
            public PlayerMock.PlayerMockType[] getPlayerTypes() {
                return new PlayerMock.PlayerMockType[]{
                        PlayerMock.PlayerMockType.DEEJEY1};
            }
        }, ALL_PLAYERS {
            @Override
            public PlayerMock.PlayerMockType[] getPlayerTypes() {
                return new PlayerMock.PlayerMockType[]{
                        PlayerMock.PlayerMockType.DEEJEY1,
                        PlayerMock.PlayerMockType.DEEJEY2,
                        PlayerMock.PlayerMockType.DEEJEY3,
                        PlayerMock.PlayerMockType.SOUND1,
                        PlayerMock.PlayerMockType.OUTER_BAND1,
                        PlayerMock.PlayerMockType.OUTER_BAND2};
            }
        }, OUTER_PLAYERS {
            @Override
            public PlayerMock.PlayerMockType[] getPlayerTypes() {
                return new PlayerMock.PlayerMockType[]{
                        PlayerMock.PlayerMockType.OUTER_BAND1,
                        PlayerMock.PlayerMockType.OUTER_BAND2};
            }
        };

        public abstract PlayerMock.PlayerMockType[] getPlayerTypes();
    }
}
