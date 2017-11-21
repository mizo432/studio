package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Lists2.unmodifiableList;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Studios implements ListValue<Studio> {

    List<Studio> list = newArrayList();


    public Studios(Collection<Studio> studioCollection) {
        list.addAll(studioCollection);

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addAllDeclaredFields()
                .multiLine()
                .omitNullValues()
                .toString();
    }

    @Override
    public List<Studio> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<Studio> iterator() {
        return asList().iterator();
    }

    public Studio first() {
        if (list.isEmpty()) throw new IndexOutOfBoundsException();
        return list.get(0);
    }
}
