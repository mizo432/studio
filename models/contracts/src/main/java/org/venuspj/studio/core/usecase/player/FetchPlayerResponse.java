package org.venuspj.studio.core.usecase.player;

import org.venuspj.cleanArchitecture.useCase.Response;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;

public interface FetchPlayerResponse extends Response {

    void setPlayer(Player aPlayer);

}
