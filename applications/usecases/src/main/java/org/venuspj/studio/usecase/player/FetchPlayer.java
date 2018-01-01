package org.venuspj.studio.usecase.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.usecase.player.FetchPlayerRequest;
import org.venuspj.studio.core.usecase.player.FetchPlayerResponse;
import org.venuspj.studio.core.usecase.player.FetchPlayerUseCase;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;

@Service
public class FetchPlayer implements FetchPlayerUseCase {
    PlayerRepository playerRepository;

    @Autowired
    FetchPlayer(PlayerRepository aPlayerRepository) {
        playerRepository = aPlayerRepository;
    }

    @Override
    public void execute(FetchPlayerRequest request, FetchPlayerResponse response) {
        PartyIdentifier playerIdentifier = request.getPlayerIdentifier();

        Player player = playerRepository.resolve(playerIdentifier);

        response.setPlayer(player);

    }
}
