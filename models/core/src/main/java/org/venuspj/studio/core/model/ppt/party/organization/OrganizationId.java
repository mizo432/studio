package org.venuspj.studio.core.model.ppt.party.organization;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyId;

public class OrganizationId extends PartyId {

    public OrganizationId(String aValue) {
        super(Party.class, aValue);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
