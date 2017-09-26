package org.venuspj.studio.core.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.ppt.party.Party;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

/**
 * 組織部門
 */
public class OrganizationUnit extends Party implements Entity<Party> {

    private final OrganizationUnits childOrganizationUnits;

    public OrganizationUnit(EntityIdentifier<Party> anIdentifier, Name aName, OrganizationUnits anyChildOrganizationUnits) {
        super(anIdentifier, aName);
        childOrganizationUnits = anyChildOrganizationUnits;
    }

    @Override
    protected Objects2.ToStringHelper string() {
        return super.string()
                .add("childOrganizationUnits", childOrganizationUnits);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
