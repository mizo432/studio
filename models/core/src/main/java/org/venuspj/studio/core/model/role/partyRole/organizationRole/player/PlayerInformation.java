package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleInformation;

public class PlayerInformation extends PartyRoleInformation {
    protected final Name name;
    private final PlayerClassification playerClassification;

    public PlayerInformation(Name aName, PlayerClassification aPlayerClassification) {
        super(new Name("PLAYER"));
        name = aName;
        playerClassification = aPlayerClassification;
    }

    public PlayerInformation() {
        super(new Name("PLAYER"));
        name = Name.empty();
        playerClassification = PlayerClassification.NULL_PLAYER;
    }

    public boolean isStudioPlayer() {
        return playerClassification.isStudioPlayer();
    }
}
