package org.venuspj.studio.core.model.player;

import org.venuspj.util.list.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class PlayerIds {
    List<PlayerId> list = Lists2.newArrayList();

    PlayerIds() {
    }

    public PlayerIds(List<PlayerId> aList) {
        list.addAll(aList);
    }

    public static PlayerIds empty() {
        return new PlayerIds();
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
