package org.venuspj.studio.fundamentals.breadcrumbs;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.addAll;
import static org.venuspj.util.collect.Lists2.newArrayList;

public class Breadcrumbs implements Iterable<Breadcrumb> {

    private List<Breadcrumb> list = newArrayList();

    public Breadcrumbs(Collection<Breadcrumb> anyCollection) {
        addAll(list, anyCollection);
    }

    @Override
    public Iterator<Breadcrumb> iterator() {
        return list.iterator();
    }
}
