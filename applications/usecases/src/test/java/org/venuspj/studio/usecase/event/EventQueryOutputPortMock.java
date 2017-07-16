package org.venuspj.studio.usecase.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class EventQueryOutputPortMock implements EventQueryOutputPort {
    Players players;
    Event event;

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
        return Objects2
                .toStringHelper(this)
                .add("event", event)
                .add("players", players)
                .omitNullValues()
                .toString();
    }
}
