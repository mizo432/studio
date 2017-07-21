package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.util.collect.Lists2;

import java.util.List;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class PlayersMock {
    public static Players createDummy(PlayersType aPlayersType) {
        PlayerMock.PlayerType[] playerTypes = aPlayersType.playerTypes();
        List<Player> players = Lists2.newArrayListWithExpectedSize(playerTypes.length);
        for (PlayerMock.PlayerType playeType : playerTypes) {
            players.add(PlayerMock.createDummy(playeType));
        }
        return new Players(players);
    }

    public enum PlayersType {
        ONE_DEEJEY {
            @Override
            public PlayerMock.PlayerType[] playerTypes() {
                return new PlayerMock.PlayerType[]{PlayerMock.PlayerType.DEEJEY1};
            }
        }, TWO_DEEJEY {
            @Override
            public PlayerMock.PlayerType[] playerTypes() {
                return new PlayerMock.PlayerType[]{PlayerMock.PlayerType.DEEJEY1};
            }
        }, TWO_PLAYER {
            @Override
            public PlayerMock.PlayerType[] playerTypes() {
                return new PlayerMock.PlayerType[]{PlayerMock.PlayerType.DEEJEY1};
            }
        }, ALL_PLAYER {
            @Override
            public PlayerMock.PlayerType[] playerTypes() {
                return new PlayerMock.PlayerType[]{PlayerMock.PlayerType.DEEJEY1, PlayerMock.PlayerType.DEEJEY2, PlayerMock.PlayerType.SOUND1, PlayerMock.PlayerType.SOUND2};
            }
        }, EMPTY_PLAYER {
            @Override
            public PlayerMock.PlayerType[] playerTypes() {
                return new PlayerMock.PlayerType[0];
            }
        };


        public abstract PlayerMock.PlayerType[] playerTypes();
    }

}
