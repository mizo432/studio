package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCodeMock;

/**
 */
public class PlayerIdMock {
    public static PlayerId createDummy(PlayerIdType aPlayerIdType) {
        return new PlayerId(StudioCodeMock.createDummy(),
                PlayerCodeMock.createDummy(aPlayerIdType.playerCodeType()));

    }

    public enum PlayerIdType {
        DEEJEY1 {
            @Override
            public PlayerCodeMock.PlayerCodeType playerCodeType() {
                return PlayerCodeMock.PlayerCodeType.DEEJEY1;
            }
        }, DEEJEY2 {
            @Override
            public PlayerCodeMock.PlayerCodeType playerCodeType() {
                return PlayerCodeMock.PlayerCodeType.DEEJEY2;
            }
        }, SOUND1 {
            @Override
            public PlayerCodeMock.PlayerCodeType playerCodeType() {
                return PlayerCodeMock.PlayerCodeType.SOUND1;
            }
        }, SOUND2 {
            @Override
            public PlayerCodeMock.PlayerCodeType playerCodeType() {
                return PlayerCodeMock.PlayerCodeType.SOUND2;
            }
        };

        public abstract PlayerCodeMock.PlayerCodeType playerCodeType();
    }

}
