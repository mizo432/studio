package org.venuspj.studio.core.model.role.partyRole.organizationRole.studioPlayer;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerClassification;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;

public class StudioPlayer extends Player {

    public StudioPlayer(OrganizationUnit anOrganizationUnit, PlayerClassification aPlayerClassification, StudioPlayerInfo aStudioPlayerInfo) {
        super(anOrganizationUnit, aPlayerClassification, aStudioPlayerInfo);
    }
}
