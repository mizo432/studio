package org.venuspj.studio.core.model.player;

import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

public class Player {

    Name name = Name.defaultName();
    PlayerId playerId = PlayerId.defaultId();

    Player() {

    }

    public Player(PlayerId aPlayerId, Name aName) {
        playerId = aPlayerId;
        name = aName;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("playerId", playerId)
                .add("name", name)
                .omitNullValues()
                .toString();
    }

}
