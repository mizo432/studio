package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.AbstractCrudRepositoryMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;

import java.util.List;

import static org.venuspj.util.collect.Lists2.*;

public class PlayerRepositoryMock extends AbstractCrudRepositoryMock<Player, Players> implements PlayerRepository {

    public PlayerRepositoryMock(Iterable<Player> anyIterable) {
        super(anyIterable);
    }

    @Override
    public Players resolve(Iterable<EntityIdentifier<Player>> anyIdentifiers) {
        List<Player> resultList = newArrayList();
        for (EntityIdentifier<Player> entityIdentifier : anyIdentifiers) {
            if (contains(entityIdentifier)) {
                resultList.add(resolve(entityIdentifier));

            }
        }
        return new Players(resultList);
    }

    @Override
    public Players asEntitiesList() {
        List<Player> resultList = newArrayList();
        for (Player entity : map.values())
            resultList.add(entity);
        return new Players(resultList);
    }

}
