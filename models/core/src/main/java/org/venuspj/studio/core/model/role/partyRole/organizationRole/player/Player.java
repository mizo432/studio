package org.venuspj.studio.core.model.role.partyRole.organizationRole.player;

import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnit;
import org.venuspj.studio.generic.model.ppt.party.organization.OrganizationUnitImpl;
import org.venuspj.studio.generic.model.role.partyRole.organizationRole.OrganizationRoleImpl;
import org.venuspj.util.objects2.Objects2;

/**
 * プレイヤー 組織の役割
 */
public class Player extends OrganizationRoleImpl {

    Name name = Name.defaultName();
    PlayerClassification playerClassification = PlayerClassification.OUTER_PLAYER;

    Player() {
        super();

    }

    public Player(OrganizationUnit anOrganizationUnit, PlayerClassification aPlayerClassification) {
        super(anOrganizationUnit);
        playerClassification = aPlayerClassification;
    }

    public static Player emptyPlayer() {
        return new Player(OrganizationUnitImpl.emptyOrganizationUnit(), PlayerClassification.NULL_PLAYER);
    }

    @Override
    public Party clone() {
        return new Player(organizationUnit, playerClassification);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("identifier", identifier())
                .add("name", name)
                .add("playerClassification", playerClassification)
                .omitNullValues()
                .toString();
    }

    public boolean isStudioPlayer() {
        return playerClassification.isStudioPlayer();
    }

}
