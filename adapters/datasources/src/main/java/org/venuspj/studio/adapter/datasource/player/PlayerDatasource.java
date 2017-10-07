package org.venuspj.studio.adapter.datasource.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class PlayerDatasource implements PlayerRepository {


    @Override
    public void delete(Player anEntity) {

    }

    @Override
    public Player resolve(EntityIdentifier<Party> anIdentifier) {
        return null;
    }

    @Override
    public Iterable<Player> resolve(Iterable<EntityIdentifier<Party>> anyIdentifiers) {
        return null;
    }

    @Override
    public Iterable<Player> asEntitiesList() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Party> anIdentifier) {
        return false;
    }

    @Override
    public <S extends Player> boolean contains(S anEntity) {
        return false;
    }

    @Override
    public <S extends Player> void store(S entity) {

    }

    @Override
    public void delete(EntityIdentifier<Party> anIdentifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Party>> anyIdentifiers) {

    }

}
