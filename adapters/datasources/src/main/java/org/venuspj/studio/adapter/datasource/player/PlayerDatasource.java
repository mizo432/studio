package org.venuspj.studio.adapter.datasource.player;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;

import java.util.List;
import java.util.Set;

public class PlayerDatasource implements PlayerRepository {

    @Override
    public Player resolve(EntityIdentifier<Player> identifier) {
        return null;
    }

    @Override
    public List<Player> asEntitiesList() {
        return null;
    }

    @Override
    public Set<Player> asEntitiesSet() {
        return null;
    }

    @Override
    public boolean contains(EntityIdentifier<Player> identifier) {
        return false;
    }

    @Override
    public boolean contains(Player entity) {
        return false;
    }

    @Override
    public void store(Player entity) {

    }

    @Override
    public void delete(EntityIdentifier<Player> identifier) {

    }

    @Override
    public void delete(Player entity) {

    }

    @Override
    public List<Player> findByIdentifiers(Iterable<EntityIdentifier<Player>> entityIdentifiers) {
        return null;
    }
}
