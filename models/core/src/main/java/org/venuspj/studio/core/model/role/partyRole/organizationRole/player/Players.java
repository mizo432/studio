package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.util.collect.Lists2;
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

    public Players selectStudioPlayers() {
        List<Player> resultList = Lists2.newArrayList();
        for (Player player : list) {
            if (player.isStudioPlayer()) {
                resultList.add(player);
            }
        }
        return new Players(resultList);
    }

    public Integer playerSize() {
        return list.size();
    }

    public List<Player> asList() {
        return Lists2.unmodifiableList(list);

    }

}
