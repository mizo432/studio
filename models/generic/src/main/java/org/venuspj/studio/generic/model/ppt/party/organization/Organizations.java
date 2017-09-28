package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Lists2.unmodifiableList;

public class Organizations implements ListValue<Organization> {
    List<Organization> list = newArrayList();

    public List<Organization> asList() {
        return unmodifiableList(list);
    }

    public Iterator<Organization> iterator() {
        return list.iterator();
    }
}
