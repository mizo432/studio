package org.venuspj.studio.core.usecase.player.players;

import org.venuspj.cleanArchitecture.useCase.Request;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerCriteria;

public interface FetchPlayersRequest extends Request {

    PlayerCriteria getPlayerCriteria();

}
