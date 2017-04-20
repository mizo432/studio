package jp.or.venuspj.studio.core.model.player;

import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.util.objects2.Objects2;

public class Player {

    Name name = Name.defaultName();

    Player() {

    }

    public Player(Name aName) {
        name = aName;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("name", name)
                .omitNullValues()
                .toString();
    }

}
