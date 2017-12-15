package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.unmodifiableList;
import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class People extends AbstractListValue<Person> {

    public <P extends Person> People(Collection<P> anyCollection) {
        super(anyCollection);
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
        return that instanceof People && sameValueOf((People) that);
    }

    public boolean sameValueOf(People that) {
        return equal(list, that.list);
    }

    @Override
    public int hashCode() {
        return hash(list.toArray());
    }
}
