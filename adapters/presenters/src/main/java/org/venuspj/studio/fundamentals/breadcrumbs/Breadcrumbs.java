package org.venuspj.studio.fundamentals.breadcrumbs;

import java.util.List;

import static org.venuspj.util.collect.Lists2.addAll;
import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Breadcrumbs {

    List<Breadcrumb> list = newArrayList();

    public Breadcrumbs(Iterable<Breadcrumb> iterable) {
        addAll(list, iterable);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
