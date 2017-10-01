package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

public enum PlayerClassification {
    OUTER_PLAYER, STUDIO_PLAYER, NULL_PLAYER;

    public boolean isStudioPlayer() {
        return this == STUDIO_PLAYER;
    }
}
