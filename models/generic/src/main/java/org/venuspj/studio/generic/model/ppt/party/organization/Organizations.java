package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.ListValue;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class Organizations implements ListValue<OrganizationImpl> {
    List<OrganizationImpl> list = newArrayList();

    @Override
    public List<OrganizationImpl> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<OrganizationImpl> iterator() {
        return list.iterator();
    }
}
