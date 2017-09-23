package org.venuspj.studio.adapter.datasource.studio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.adapter.doma.dao.StudioDao;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.note.Note;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.Studio;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.StudioCode;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile.Profile;
import org.venuspj.studio.generic.fundamentals.description.Description;
import org.venuspj.studio.generic.fundamentals.name.Name;

import java.util.List;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
@Repository
public class StudioDatasource implements CrudRepository<Studio> {
    private final StudioDao studioDao;

    @Autowired
    StudioDatasource(StudioDao aStudioDao) {
        studioDao = aStudioDao;

    }

    @Override
    public Studio resolve(EntityIdentifier<Studio> identifier) {
        StudioCode studioCode = (StudioCode) identifier;
        org.venuspj.studio.adapter.doma.entity.Studio studioWork = studioDao.selectById(studioCode.asText());
        if (nonNull(studioWork))
            return new Studio(
                    new Name(studioWork.getStudioName()),
                    new StudioCode(studioWork.getStudioCode()),
                    new Profile(Note.defailtNote()),
                    new Descriptor(new Name(studioWork.getStudioName()),
                            Description.emptyDescription()));
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
