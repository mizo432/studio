package org.venuspj.studio.generic.fundamentals.address.city;

import org.venuspj.ddd.model.value.ListValue;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 */
public class Cities implements ListValue<City> {
    List<City> list = Lists2.newArrayList();

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
}
