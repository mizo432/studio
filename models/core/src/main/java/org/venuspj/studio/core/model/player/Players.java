package org.venuspj.studio.core.model.player;

import org.venuspj.util.list2.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class Players {

    List<Player> list = Lists2.newArrayList();

    Players() {
    }

    public Players(List<Player> aList) {
        list.addAll(aList);
    }

    public static Players empty() {
        return new Players();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

}
