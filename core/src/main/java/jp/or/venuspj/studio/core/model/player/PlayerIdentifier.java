package jp.or.venuspj.studio.core.model.player;

import jp.or.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.UUID;

public class PlayerIdentifier implements EntityIdentifier<Player> {

    private final String kind;
    private UUID uuid;

    PlayerIdentifier() {
        kind = Player.class.getCanonicalName();

    }

    public PlayerIdentifier(UUID anUuid) {
        kind = Player.class.getCanonicalName();
        uuid = anUuid;
    }

    @Override
    public String getKind() {
        return kind;
    }

    @Override
    public UUID toUUID() {
        return uuid;
    }
}
