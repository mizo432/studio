package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class OrganizationUnits extends AbstractListValue<OrganizationUnit> {

    private OrganizationUnits() {
        super();
    }

    public OrganizationUnits(Collection<? extends OrganizationUnit> anyList) {
        super(anyList);

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
