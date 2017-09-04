package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.util.objects2.Objects2;

import java.util.List;

public class People {
    List<Person> list;

    public People(List<Person> anyList) {
        list.addAll(anyList);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }
}
