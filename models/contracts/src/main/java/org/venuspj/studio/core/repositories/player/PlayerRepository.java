package org.venuspj.studio.core.repositories.player;

import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.core.model.player.Players;

public interface PlayerRepository {
    Players findByPlayersIds(PlayerIds playerIds);
}
