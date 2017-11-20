package org.venuspj.studio.generic.model.ppt.any;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class Anys implements ListValue<Any> {
    List<Any> list = newArrayList();

    @Override
    public List<Any> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<Any> iterator() {
        return asList().iterator();
    }

    @Override
    public boolean equals(Object that) {
        return equal(list, that);
    }

    @Override
    public int hashCode() {
        return hash(list);
    }
}
