package org.venuspj.studio.generic.model.ppt.any.subAny.subSubAny;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.unmodifiableList;

public class SubSubAnysImpl implements SubSubAnys {

    List<SubSubAny> list = new ArrayList<>();


    public <A extends SubSubAny> SubSubAnysImpl(Collection<A> anyCollection) {
        list.addAll(anyCollection);
    }


    @Override
    public List<SubSubAny> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<SubSubAny> iterator() {
        return asList().iterator();
    }
}
