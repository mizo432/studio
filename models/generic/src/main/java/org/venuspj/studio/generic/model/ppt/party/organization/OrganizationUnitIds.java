package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationUnitIds implements Iterable<EntityIdentifier<OrganizationUnit>> {
    List<OrganizationUnitId> list = newArrayList();

    public OrganizationUnitIds() {

    }

    public OrganizationUnitIds(List<OrganizationUnitId> anylist) {
        list.addAll(anylist);

    }

    public static OrganizationUnitIds emptyOrganizationUnitIds() {
        return new OrganizationUnitIds();
    }

    @Override
    public Iterator<EntityIdentifier<OrganizationUnit>> iterator() {

        List<EntityIdentifier<OrganizationUnit>> result = newArrayList();
        for (OrganizationUnitId organizationUnitId : list)
            result.add(organizationUnitId);
        return result.iterator();
    }

    @Override
    public boolean equals(Object that) {
        return false;
    }

    @Override
    public int hashCode() {
        return hash(list);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(list)
                .omitNullValues()
                .toString();
    }
}
