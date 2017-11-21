package org.venuspj.studio.adapter.datasource.role.partyRole.organizationRole.studio;

import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCriteria;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studios;
import org.venuspj.studio.generic.model.ppt.party.Party;

@Repository
public class StudioDataSource implements StudioRepository{

    @Override
    public Studio resolve(EntityIdentifier<Party> anIdentifier) {
        return null;
    }

    @Override
    public Studios resolve(Iterable<EntityIdentifier<Party>> anyIdentifiers) {
        return null;
    }

    @Override
    public Studios asEntitiesList() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Party> anIdentifier) {
        return false;
    }

    @Override
    public <S extends Studio> boolean contains(S anEntity) {
        return false;
    }

    @Override
    public <S extends Studio> void store(S entity) {

    }

    @Override
    public void delete(EntityIdentifier<Party> anIdentifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Party>> anyIdentifiers) {

    }

    @Override
    public <S extends Studio> void delete(S anEntity) {

    }

    @Override
    public Studios resolve(StudioCriteria StudioCriteria) {
        return null;
    }
}
