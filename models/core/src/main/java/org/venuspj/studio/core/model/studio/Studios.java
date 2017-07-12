package org.venuspj.studio.core.model.studio;

import org.venuspj.util.list2.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.Iterator;
import java.util.List;

public class Studios implements Iterable<Studio> {
    List<Studio> list = Lists2.newArrayList();

    Studios() {

    }

    public Studios(List<Studio> aList) {
        list.addAll(aList);
    }

    public static Studios empty() {
        return new Studios();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<Studio> iterator() {
        return list.iterator();
    }
}
