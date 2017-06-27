package org.venuspj.studio.core.model.player;

public enum PlayerClassification {
    OUTER_PLAYER, STUDIO_PLAYER;

    public boolean isStudioPlayer() {
        return this == STUDIO_PLAYER;
    }
}
