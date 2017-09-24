package org.venuspj.studio.usecase.event;

import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.model.momentInterval.momemt.event.EventCredential;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class EventQuery implements EventQueryUseCase {

    EventQueryInputPort inputPort;
    EventQueryOutputPort outputPort;
    EventRepository eventRepository;
    PlayerRepository playerRepository;

    public EventQuery(EventRepository anEventRepository, PlayerRepository aPlayerRepository) {
        eventRepository = anEventRepository;
        playerRepository = aPlayerRepository;
    }

    @Override
    public EventQueryUseCase withEventQueryInputPort(EventQueryInputPort anInputPort) {
        inputPort = anInputPort;
        return this;
    }

    @Override
    public EventQueryUseCase withEventQueryOutputPort(EventQueryOutputPort anOutputPort) {
        outputPort = anOutputPort;
        return this;
    }

    @Override
    public void start() {
        EventCredential credential = inputPort.toCredential();
        Event event = eventRepository.resolve(credential.eventId());
        Players players = new Players(playerRepository.resolve(event.outline().playerIds()));
        outputPort.withEvent(event);
        outputPort.withPlayers(players);

    }

}
