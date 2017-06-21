package org.venuspj.studio.core.model.player;

import org.venuspj.studio.core.model.studio.StudioCode;
import org.venuspj.util.objects2.Objects2;

public class PlayerId {
    StudioCode studioCode = StudioCode.defaultCode();
    PlayerCode playerCode = PlayerCode.defaultCode();

    PlayerId() {
    }

    public PlayerId(StudioCode aStudioCode, PlayerCode aPlayerCode) {
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
