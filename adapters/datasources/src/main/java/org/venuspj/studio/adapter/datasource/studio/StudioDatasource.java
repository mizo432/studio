package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

import java.util.List;
import java.util.Set;

/**
 */
@Repository
public class StudioDatasource implements CrudRepository<Studio> {
    StudioMapper studioMapper;

    @Autowired
    public StudioDatasource(StudioMapper aStudioMapper) {
        studioMapper = aStudioMapper;
    }

    @Override
    public Studio resolve(EntityIdentifier<Studio> identifier) {
        return null;
    }

    @Override
    public List<Studio> asEntitiesList() {
        return null;
    }

    @Override
    public Set<Studio> asEntitiesSet() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Studio> identifier) {
        //TODO atdk
        return false;
    }

    @Override
    public boolean contains(Studio entity) {
        //TODO atdk
        return false;
    }

    @Override
    public void store(Studio entity) {
        //TODO atdk

    }

    @Override
    public void delete(EntityIdentifier<Studio> identifier) {
        //TODO atdk

    }

    @Override
    public void delete(Studio entity) {
        //TODO atdk

    }
}
