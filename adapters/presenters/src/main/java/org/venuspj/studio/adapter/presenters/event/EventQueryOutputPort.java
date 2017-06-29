package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.player.Players;
import org.venuspj.cleanArchitecture.useCase.UseCaseOutputPort;

public class EventQueryOutputPort implements UseCaseOutputPort {
    private final Event event;
    private final Players players;
    private final Players studioPlayers;

    public EventQueryOutputPort(Event anEvent, Players aPlayers) {
        event = anEvent;
        players = aPlayers;
        studioPlayers = aPlayers.selectStudioPlayers();
    }

}
