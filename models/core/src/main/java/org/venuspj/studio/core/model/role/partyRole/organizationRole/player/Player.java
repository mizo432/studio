package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class Player extends AbstractEntity<Player> {

    Name name = Name.defaultName();
    PlayerId playerId = PlayerId.defaultId();
    PlayerClassification playerClassification = PlayerClassification.OUTER_PLAYER;

    Player() {

    }

    public Player(PlayerId aPlayerId, Name aName, PlayerClassification aPlayerClassification) {
        super(aPlayerId);
        name = aName;
        playerClassification = aPlayerClassification;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("name", name)
                .add("playerClassification", playerClassification)
                .omitNullValues()
                .toString();
    }

    public boolean isStudioPlayer() {
        return playerClassification.isStudioPlayer();
    }
}
