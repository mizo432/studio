package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class People implements ListValue<PersonImpl> {
    List<PersonImpl> list = newArrayList();

    public People(Iterable<PersonImpl> anyList) {
        addAll(list, anyList);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    @Override
    public List<PersonImpl> asList() {
        return list;
    }

    @Override
    public Iterator<PersonImpl> iterator() {
        return list.iterator();
    }
}
