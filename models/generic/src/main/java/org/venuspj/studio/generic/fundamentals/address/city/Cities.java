package org.venuspj.studio.generic.fundamentals.address.city;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.util.objects2.Objects2;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

/**
 */
public class Cities implements ListValue<City> {
    List<City> list = newArrayList();

    Cities() {
    }

    public Cities(List<City> anyList) {
        list.addAll(anyList);
    }

    public static Cities empty() {
        return new Cities();
    }

    @Override
    public List<City> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(list)
                .toString();
    }

    @Override
    public Iterator<City> iterator() {
        return list.iterator();
    }
}
