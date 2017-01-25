package jp.or.venuspj.studio.core.model.player;

import com.google.common.collect.Lists;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

public class PlayersImpl implements Players {

    List<Player> list = Lists.newArrayList();

    PlayersImpl() {
    }

    public PlayersImpl(List<Player> aList) {
        list.addAll(aList);
    }

    @Override
    public List<Player> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
