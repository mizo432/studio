package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;
import org.venuspj.util.objects2.Objects2;

public class PlayerId extends AbstractEntityIdentifier<Player> {
    StudioCode studioCode = StudioCode.defaultCode();
    PlayerCode playerCode = PlayerCode.defaultCode();

    PlayerId() {
        super(Player.class);
    }

    public PlayerId(StudioCode aStudioCode, PlayerCode aPlayerCode) {
        this();
        studioCode = aStudioCode;
        playerCode = aPlayerCode;
    }

    public static PlayerId defaultId() {
        return new PlayerId();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("studioCode", studioCode)
                .add("playerCode", playerCode)
                .omitNullValues()
                .toString();
    }
}
