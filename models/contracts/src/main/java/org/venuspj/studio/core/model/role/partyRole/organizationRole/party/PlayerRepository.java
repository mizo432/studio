package org.venuspj.studio.core.model.role.partyRole.organizationRole.party;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerIds;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;

public interface PlayerRepository {
    Players findByPlayersIds(PlayerIds playerIds);
}
