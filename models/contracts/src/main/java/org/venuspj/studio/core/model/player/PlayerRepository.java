package org.venuspj.studio.core.model.player;

public interface PlayerRepository {
    Players findByPlayersIds(PlayerIds playerIds);
}
