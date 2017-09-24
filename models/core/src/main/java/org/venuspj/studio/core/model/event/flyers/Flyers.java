package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

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

    public static Flyers empty() {
        return new Flyers();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
