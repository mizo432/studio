package org.venuspj.studio.generic.model.ppt.any.subAny;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Lists2.unmodifiableList;

public class SubAnysImpl implements SubAnys {

    List<SubAny<?>> list = newArrayList();


    public <A extends SubAny<A>> SubAnysImpl(Collection<A> anyCollection) {
        list.addAll(anyCollection);
    }


    @Override
    public List<SubAny<?>> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<SubAny<?>> iterator() {
        return asList().iterator();
    }
}
