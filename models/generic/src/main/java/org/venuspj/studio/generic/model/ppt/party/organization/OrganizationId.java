package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class OrganizationId extends PartyId implements EntityIdentifier<Party> {

    public OrganizationId(String aValue) {
        super(aValue);

    }

    public static OrganizationId newId() {
        return new OrganizationId(UuidProvider.randomUUID().toString());
    }

    public static OrganizationId empty() {
        return new OrganizationId(null);
    }
}
