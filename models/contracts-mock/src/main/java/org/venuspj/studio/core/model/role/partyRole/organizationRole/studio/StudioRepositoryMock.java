package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.AbstractCrudRepositoryMock;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class StudioRepositoryMock extends AbstractCrudRepositoryMock<Studio, Studios> implements StudioRepository {

    public StudioRepositoryMock(Iterable<Studio> anyIterable) {
        super(anyIterable);
    }

    @Override
    public Studios resolve(Iterable<EntityIdentifier<Studio>> anyIdentifiers) {
        List<Studio> resultList = newArrayList();
        for (EntityIdentifier<Studio> entityIdentifier : anyIdentifiers) {
            if (contains(entityIdentifier)) {
                resultList.add(resolve(entityIdentifier));

            }
        }
        return new Studios(resultList);
    }

    @Override
    public Studios asEntitiesList() {
        List<Studio> resultList = newArrayList();
        for (Studio entity : map.values())
            resultList.add(entity);
        return new Studios(resultList);
    }

}
