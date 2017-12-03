package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public interface StudioRepository {

    Studios resolve(PartyIdentifier partyIdentifier);

    Studios resolve(StudioCriteria StudioCriteria);

}
