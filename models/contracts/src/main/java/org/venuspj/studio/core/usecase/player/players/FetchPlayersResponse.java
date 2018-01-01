package org.venuspj.studio.core.usecase.player.players;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;

public interface FetchPlayersResponse extends Response {

    void setPlayers(Players anyPlayers);

}
