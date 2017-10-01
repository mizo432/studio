package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.Entities;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class OrganizationUnits implements Entities<OrganizationUnit> {

    List<OrganizationUnit> list = newArrayList();

    private OrganizationUnits() {

    }

    public OrganizationUnits(List<OrganizationUnit> anyList) {
        list.addAll(anyList);

    }

    public static OrganizationUnits emptyOrganizationUnits() {
        return new OrganizationUnits();
    }

    @Override
    public List<OrganizationUnit> asList() {
        return unmodifiableList(list);
    }

    @Override
    public Iterator<OrganizationUnit> iterator() {
        return list.iterator();
    }
}
