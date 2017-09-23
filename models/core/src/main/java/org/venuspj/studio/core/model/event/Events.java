package org.venuspj.studio.core.model.event;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class Events implements Iterable<Event> {
    List<Event> list = newArrayList();

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
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<Event> iterator() {
        return list.iterator();
    }

    public List<Event> asList() {
        return list;
    }
}
