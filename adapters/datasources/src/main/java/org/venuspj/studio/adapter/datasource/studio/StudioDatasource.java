package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.adapter.doma.dao.StudiosDao;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studios;

/**
 */
@Repository
public class StudioDatasource implements StudioRepository {
    private final StudiosDao studiosDao;

    @Autowired
    StudioDatasource(StudiosDao aStudiosDao) {
        studiosDao = aStudiosDao;

    }

    @Override
    public Studio resolve(EntityIdentifier<Studio> anIdentifier) {
        return null;
    }

    @Override
    public Studios resolve(Iterable<EntityIdentifier<Studio>> anyIdentifiers) {
        return null;
    }

    @Override
    public Studios asEntitiesList() {
        //TODO atdk
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Studio> anIdentifier) {
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
    public void delete(EntityIdentifier<Studio> anIdentifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Studio>> anyIdentifiers) {

    }

    @Override
    public <S extends Studio> void delete(S anEntity) {

    }

}
