package org.venuspj.studio.core.model.player;

import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class Player {

    Name name = Name.defaultName();
    PlayerId playerId = PlayerId.defaultId();
    PlayerClassification playerClassification = PlayerClassification.OUTER_PLAYER;
    Player() {

    }

    public Player(PlayerId aPlayerId, Name aName, PlayerClassification aPlayerClassification) {
        playerId = aPlayerId;
        name = aName;
        playerClassification = aPlayerClassification;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("playerId", playerId)
                .add("name", name)
                .add("playerClassification", playerClassification)
                .omitNullValues()
                .toString();
    }

    public boolean isStudioPlayer() {
        return playerClassification.isStudioPlayer();
    }
}
