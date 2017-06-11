package jp.or.venuspj.studio.core.model.event.flyers;

import jp.or.venuspj.util.list2.Lists2;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class Flyers {

    List<Flyer> list = Lists2.newArrayList();

    Flyers() {

    }

    public Flyers(List<Flyer> aList) {
        list.addAll(aList);

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    public static Flyers empty() {
        return new Flyers();
    }
}
