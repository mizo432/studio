package org.venuspj.studio.adapter.dataSource.core.role.partyRole.organizationRole.studio;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCriteria;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studios;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationRepository;

public class StudioDataSource implements StudioRepository {
    StudioMapper studioMapper;

    OrganizationRepository organizationRepository;

    public StudioDataSource(StudioMapper aStudioMapper, OrganizationRepository anOrganizationRepository){
        studioMapper = aStudioMapper;
        organizationRepository = anOrganizationRepository;
    }
    @Override
    public Studio resolve(PartyIdentifier aPartyIdentifier) {
        Studio studio = studioMapper.findOne(aPartyIdentifier);
        return new Studio.Builder().apply(studio);
    }

    @Override
    public Studios resolve(StudioCriteria StudioCriteria) {
        return null;
    }
}
