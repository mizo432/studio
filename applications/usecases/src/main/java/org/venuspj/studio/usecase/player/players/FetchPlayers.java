package org.venuspj.studio.usecase.player.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerCriteria;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.player.players.FetchPlayersRequest;
import org.venuspj.studio.core.usecase.player.players.FetchPlayersResponse;
import org.venuspj.studio.core.usecase.player.players.FetchPlayersUseCase;

@Service
public class FetchPlayers implements FetchPlayersUseCase {
    private PlayerRepository playerRepository;

    @Autowired
    public FetchPlayers(PlayerRepository aPlayerRepository) {
        playerRepository = aPlayerRepository;
    }

    @Override
    public void execute(FetchPlayersRequest request, FetchPlayersResponse response) {
        PlayerCriteria playerCriteria = request.getPlayerCriteria();
        Players players = playerRepository.resolveEntities(playerCriteria);
        response.setPlayers(players);

    }

}
