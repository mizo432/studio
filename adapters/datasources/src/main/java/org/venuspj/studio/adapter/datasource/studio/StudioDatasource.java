package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

import java.util.List;

/**
 */
@Repository
public class StudioDatasource implements CrudRepository<Studio> {


    @Override
    public Studio resolve(EntityIdentifier<Studio> identifier) {
        //TODO atdk
        return null;
    }

    @Override
    public Iterable<Studio> resolve(Iterable<EntityIdentifier<Studio>> entityIdentifiers) {
        //TODO atdk
        return null;
    }

    @Override
    public List<Studio> asEntitiesList() {
        //TODO atdk
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
    public void delete(Iterable<EntityIdentifier<Studio>> entityIdentifiers) {
        //TODO atdk

    }

    @Override
    public void delete(Studio entity) {
        //TODO atdk

    }

}
