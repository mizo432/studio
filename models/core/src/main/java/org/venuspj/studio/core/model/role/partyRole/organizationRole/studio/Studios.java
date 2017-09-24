package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.Entities;
import org.venuspj.util.collect.Lists2;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class Studios implements Iterable<Studio>, Entities<Studio> {
    List<Studio> list = Lists2.newArrayList();

    Studios() {

    }

    public Studios(List<Studio> aList) {
        list.addAll(aList);
    }

    public static Studios emptyStudios() {
        return new Studios();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<Studio> iterator() {
        return list.iterator();
    }

    @Override
    public List<Studio> asList() {
        return unmodifiableList(list);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
