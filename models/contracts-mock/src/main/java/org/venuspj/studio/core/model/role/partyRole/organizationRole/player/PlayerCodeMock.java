package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

/**
 */
public class PlayerCodeMock {
    public static PlayerCode createDummy(PlayerCodeType aPlayerCodeType) {
        return new PlayerCode(aPlayerCodeType.playerCode());
    }

    public enum PlayerCodeType {
        DEEJEY1 {
            @Override
            public String playerCode() {
                return "DEEJEY1";
            }
        }, DEEJEY2 {
            @Override
            public String playerCode() {
                return "DEEJEY2";
            }
        }, SOUND1 {
            @Override
            public String playerCode() {
                return "SOUND1";
            }
        }, SOUND2 {
            @Override
            public String playerCode() {
                return "SOUND2";
            }
        };

        public abstract String playerCode();
    }
}
