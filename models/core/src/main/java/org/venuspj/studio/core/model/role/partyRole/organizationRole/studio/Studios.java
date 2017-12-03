package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Studios implements ListValue<Studio> {

    List<Studio> list = newArrayList();


    public Studios(Collection<Studio> studioCollection) {
        list.addAll(studioCollection);

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
