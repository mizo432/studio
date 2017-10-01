package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class OrganizationUnitId extends PartyId<OrganizationUnit> implements EntityIdentifier<OrganizationUnit> {

    public OrganizationUnitId(String aValue) {
        super(aValue);

    }

    public static OrganizationUnitId newOrganizationUnitId() {
        return new OrganizationUnitId(UuidProvider.randomUUID().toString());
    }

    public static OrganizationUnitId emptyOrganizationUnitId() {
        return new OrganizationUnitId(null);
    }
}
