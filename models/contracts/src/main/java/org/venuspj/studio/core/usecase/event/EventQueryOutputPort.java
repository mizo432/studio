package org.venuspj.studio.core.usecase.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;

/**
 */
public interface EventQueryOutputPort {
    void withEvent(Event event);

    void withPlayers(Players players);
}
