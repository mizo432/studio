package org.venuspj.studio.core.model.role.partyRole.organizationRole.party;

import org.venuspj.ddd.model.repository.RoleCrudRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.generic.model.ppt.party.Party;

public interface PlayerRepository extends RoleCrudRepository<Player, Party> {

}
