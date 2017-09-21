package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.adapter.builder.studio.StudioBuilder;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;

import java.util.List;

import static org.venuspj.util.collect.Lists2.newArrayList;

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
        return studioMapper.resolve(identifier);
    }

    @Override
    public Iterable<Studio> resolve(Iterable<EntityIdentifier<Studio>> entityIdentifiers) {
        List<Studio> result = newArrayList();
        List<Studio> mapperResults = studioMapper.resolve(entityIdentifiers);
        for (Studio entity : mapperResults)
            result.add(new StudioBuilder().apply(entity));
        return result;
    }

    @Override
    public List<Studio> asEntitiesList() {
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
