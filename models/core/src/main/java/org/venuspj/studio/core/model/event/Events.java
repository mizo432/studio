package org.venuspj.studio.core.model.event;

import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class Events {
    List<Event> list = Lists2.newArrayList();

    Events() {

    }

    public Events(List<Event> aList) {
        list.addAll(aList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    public static Events empty() {
        return new Events();
    }
}
