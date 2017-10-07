package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * 出演者
 */
public class Performer {
    private Player player = Player.emptyPlayer();
    private PerformerInfo performerInfo = PerformerInfo.emptyPerformerInfo();

    public Performer(Player aPlayer, PerformerInfo aPerformerInfo) {
        player = aPlayer;
        performerInfo = aPerformerInfo;

    }

    Performer() {

    }

    public static Performer emptyPerformer() {
        return new Performer();
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("performerInfo", performerInfo)
                .add("player", player)
                .omitNullValues()
                .toString();
    }
}
