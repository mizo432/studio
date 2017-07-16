package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.util.objects2.Objects2;

public class EventPage implements EventQueryOutputPort {
    private Event event;
    private Players players;
    private Players studioPlayers;

    @Override
    public void withEvent(Event anEvent) {
        event = anEvent;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("event", event)
                .add("players", players)
                .add("studioPlayers", studioPlayers)
                .omitNullValues()
                .toString();
    }
}
