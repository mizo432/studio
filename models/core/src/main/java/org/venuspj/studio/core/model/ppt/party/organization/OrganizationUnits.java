package org.venuspj.studio.core.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.Entities;
import org.venuspj.studio.core.model.ppt.party.Party;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;
import static org.venuspj.util.collect.Lists2.unmodifiableList;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class OrganizationUnits implements Entities<Party> {
    List<Party> list = newArrayList();

    public OrganizationUnits(List<Party> anyList) {
        anyList.addAll(anyList);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }

    @Override
    public List<Party> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<Party> iterator() {
        return unmodifiableList(list).iterator();
    }

}
