package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

import static org.venuspj.util.objects2.Objects2.nonNull;

/**
 * プレイヤー 組織の役割
 */
public class Player extends PartyRoleImpl {

    private final PlayerInformation playerInformation;

    protected Player() {
        super();
        playerInformation = null;

    }

    public <P extends Party, PI extends PlayerInformation> Player(P anParty, PI aPlayerInformation) {
        super(anParty, aPlayerInformation);
        playerInformation = aPlayerInformation;
    }

    public boolean isStudioPlayer() {
        return nonNull(playerInformation) && playerInformation.isStudioPlayer();
    }

    public static Player empty() {
        return new Player();
    }
}
