package org.venuspj.studio.usecase.event;

import org.springframework.stereotype.Service;
import org.venuspj.studio.adapter.presenters.event.EventQueryOutputPort;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventCredential;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.core.model.player.Players;
import org.venuspj.studio.core.repositories.event.EventRepository;
import org.venuspj.studio.core.repositories.player.PlayerRepository;
import org.venuspj.studio.core.usecases.event.EventQuery;
import org.venuspj.studio.core.usecases.event.EventQueryInputPort;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class EventQueryImpl implements EventQuery {

    EventQueryInputPort useCaseInputPort;
    EventRepository eventRepository;
    PlayerRepository playerRepository;

    public EventQueryImpl(EventRepository anEventRepository, PlayerRepository aPlayerRepository) {
        eventRepository = anEventRepository;
        playerRepository = aPlayerRepository;
    }

    @Override
    public EventQuery withInputPort(EventQueryInputPort anUseCaseInputPort) {
        useCaseInputPort = anUseCaseInputPort;

        return this;
    }

    @Override
    public EventQueryOutputPort start() {
        EventCredential credential = useCaseInputPort.toCredential();
        Event event = eventRepository.findOne(credential);
        PlayerIds playerIds = event.playerIds();
        Players players = playerRepository.findByPlayersIds(playerIds);
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPort(event, players);
        return eventQueryOutputPort;
    }

}
