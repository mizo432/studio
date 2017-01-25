package jp.or.venuspj.studio.core.model.player;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;

public interface Player {
    PlayerValue value();

    EntityIdentifier<Player> identifier();

}
