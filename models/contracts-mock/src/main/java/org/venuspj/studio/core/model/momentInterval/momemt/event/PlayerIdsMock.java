package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerIds;
import org.venuspj.util.collect.Lists2;

/**
 */
public class PlayerIdsMock {
    public static PlayerIds createDummy(PlayerIdsType aPlayerIdsType) {
        return new PlayerIds(Lists2.newArrayList());

    }

    public enum PlayerIdsType {
        ONE_PLAYER

    }

}
