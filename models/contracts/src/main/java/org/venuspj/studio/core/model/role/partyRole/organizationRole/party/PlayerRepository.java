package org.venuspj.studio.core.model.role.partyRole.organizationRole.party;

import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;

public interface PlayerRepository extends CrudRepository<Player, Players> {
}
