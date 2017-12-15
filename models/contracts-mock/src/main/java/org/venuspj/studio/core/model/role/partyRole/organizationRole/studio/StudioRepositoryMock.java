package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

public class StudioRepositoryMock implements StudioRepository {
    @Override
    public Studio resolve(PartyIdentifier partyIdentifier) {
        return StudioMock.createDummy(StudioMock.MockType.LHS);
    }

    @Override
    public Studios resolve(StudioCriteria StudioCriteria) {
        return null;
    }
}
