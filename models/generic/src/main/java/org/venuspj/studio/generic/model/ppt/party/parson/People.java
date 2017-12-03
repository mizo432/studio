package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class People implements ListValue<Person> {
    List<Person> list = newArrayList();

    public <P extends Person> People(Collection<P> anyCollection) {
        list.addAll(anyCollection);
    }

    @Override
    public List<Person> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<Person> iterator() {
        return asList().iterator();
    }

    @Override
    public boolean equals(Object that) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
