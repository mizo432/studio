package org.venuspj.studio.core.model.role.partyRole.organizationRole.studioPlayer;

import org.venuspj.ddd.model.value.AbstractListValue;

import java.util.Collection;

public class StudioPlayers extends AbstractListValue<StudioPlayer> {

    public StudioPlayers(Collection<? extends StudioPlayer> anyList) {
        super(anyList);
    }
}
