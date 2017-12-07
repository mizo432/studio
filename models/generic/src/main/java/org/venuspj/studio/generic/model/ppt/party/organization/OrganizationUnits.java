package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class OrganizationUnits extends AbstractListValue<OrganizationUnit> {

    private OrganizationUnits() {
        super();
    }

    public OrganizationUnits(Collection<? extends OrganizationUnit> anyList) {
        super(anyList);

    }

    public static OrganizationUnits empty() {
        return new OrganizationUnits();
    }

}
