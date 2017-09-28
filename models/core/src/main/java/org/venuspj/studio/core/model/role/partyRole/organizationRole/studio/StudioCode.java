package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationId;

/**
 */
public class StudioCode extends OrganizationId implements EntityIdentifier<Party> {

    StudioCode() {
        this("");
    }

    public StudioCode(String aValue) {
        super(aValue);
    }

    public static StudioCode defaultCode() {
        return new StudioCode("");
    }

}
