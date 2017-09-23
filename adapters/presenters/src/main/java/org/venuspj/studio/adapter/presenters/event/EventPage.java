package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;

import static org.venuspj.util.objects2.Objects2.*;

public class EventPage implements EventQueryOutputPort {
    private Event event;
    private Players players;

    @Override
    public void withEvent(Event anEvent) {
        event = anEvent;
    }

    @Override
    public void withPlayers(Players anyPlayers) {
        players = anyPlayers;

    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("event", event)
                .add("players", players)
                .omitNullValues()
                .toString();
    }
}
