package org.venuspj.studio.core.model.event;

import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.Iterator;
import java.util.List;

public class Events implements Iterable<Event> {
    List<Event> list = Lists2.newArrayList();

    Events() {

    }

    public Events(List<Event> aList) {
        list.addAll(aList);
    }

    public static Events empty() {
        return new Events();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<Event> iterator() {
        return list.iterator();
    }
}
