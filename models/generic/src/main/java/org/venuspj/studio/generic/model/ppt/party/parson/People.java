package org.venuspj.studio.generic.model.ppt.party.parson;

import java.util.List;

import static org.venuspj.util.collect.Lists2.addAll;
import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class People {
    List<Person> list = newArrayList();

    public People(Iterable<Person> anyList) {
        addAll(list, anyList);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    public List<Person> asList() {
        return list;
    }
}
