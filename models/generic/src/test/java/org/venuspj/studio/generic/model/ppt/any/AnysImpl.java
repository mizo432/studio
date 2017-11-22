package org.venuspj.studio.generic.model.ppt.any;

import java.util.*;

import static org.venuspj.util.collect.Lists2.unmodifiableList;

public class AnysImpl implements Anys {

    List<Any> list = new ArrayList<>();


    public <A extends Any<A>> AnysImpl(Collection<A> anyCollection) {
        list.addAll(anyCollection);
    }


    @Override
    public List<Any> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<Any> iterator() {
        return asList().iterator();
    }
}
