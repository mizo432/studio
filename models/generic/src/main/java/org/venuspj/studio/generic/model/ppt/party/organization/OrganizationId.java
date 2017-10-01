package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class OrganizationId extends PartyId<Organization> {

    public OrganizationId(String aValue) {
        super(aValue);

    }

    public static OrganizationId newOrganizationId() {
        return new OrganizationId(UuidProvider.randomUUID().toString());
    }

    public static OrganizationId emptyOrganizationId() {
        return new OrganizationId(null);
    }
}
