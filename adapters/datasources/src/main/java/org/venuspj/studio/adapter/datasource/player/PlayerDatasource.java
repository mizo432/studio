package org.venuspj.studio.adapter.datasource.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;

public class PlayerDatasource implements PlayerRepository {

    @Override
    public Player resolve(EntityIdentifier<Player> anIdentifier) {
        return null;
    }

    @Override
    public Players resolve(Iterable<EntityIdentifier<Player>> anyIdentifiers) {
        return null;
    }

    @Override
    public Players asEntitiesList() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Player> anIdentifier) {
        return false;
    }

    @Override
    public boolean contains(Player anEntity) {
        return false;
    }

    @Override
    public void store(Player entity) {

    }

    @Override
    public void delete(EntityIdentifier<Player> anIdentifier) {

    }

    @Override
    public void delete(Iterable<EntityIdentifier<Player>> anyIdentifiers) {

    }

    @Override
    public void delete(Player anEntity) {

    }

}
