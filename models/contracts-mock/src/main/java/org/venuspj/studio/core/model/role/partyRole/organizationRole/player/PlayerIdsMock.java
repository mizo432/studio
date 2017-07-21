package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.util.collect.Lists2;

import java.util.List;

/**
 */
public class PlayerIdsMock {
    public static PlayerIds createDummy(PlayerIdsType aPlayerIdsType) {
        PlayerIdMock.PlayerIdType[] playerIdTypes = aPlayerIdsType.playerIdTypes();
        List<EntityIdentifier<Player>> playerIds = Lists2.newArrayListWithExpectedSize(playerIdTypes.length);
        for (PlayerIdMock.PlayerIdType playerIdType : playerIdTypes) {
            playerIds.add(PlayerIdMock.createDummy(playerIdType));
        }
        return new PlayerIds(playerIds);

    }

    public enum PlayerIdsType {
        ONE_DEEJEY {
            @Override
            public PlayerIdMock.PlayerIdType[] playerIdTypes() {
                return new PlayerIdMock.PlayerIdType[]{PlayerIdMock.PlayerIdType.DEEJEY1};
            }
        }, TWO_DEEJEY {
            @Override
            public PlayerIdMock.PlayerIdType[] playerIdTypes() {
                return new PlayerIdMock.PlayerIdType[]{PlayerIdMock.PlayerIdType.DEEJEY1, PlayerIdMock.PlayerIdType.DEEJEY2};
            }
        }, TWO_PLAYER {
            @Override
            public PlayerIdMock.PlayerIdType[] playerIdTypes() {
                return new PlayerIdMock.PlayerIdType[]{PlayerIdMock.PlayerIdType.DEEJEY1, PlayerIdMock.PlayerIdType.SOUND1};
            }
        }, ALL_PLAYER {
            @Override
            public PlayerIdMock.PlayerIdType[] playerIdTypes() {
                return new PlayerIdMock.PlayerIdType[]{PlayerIdMock.PlayerIdType.DEEJEY1, PlayerIdMock.PlayerIdType.DEEJEY2, PlayerIdMock.PlayerIdType.SOUND1, PlayerIdMock.PlayerIdType.SOUND2};
            }
        }, EMPTY_PLAYER {
            @Override
            public PlayerIdMock.PlayerIdType[] playerIdTypes() {
                return new PlayerIdMock.PlayerIdType[]{};
            }
        };

        public abstract PlayerIdMock.PlayerIdType[] playerIdTypes();
    }

}
