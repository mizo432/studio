package org.venuspj.studio.core.model.role.partyRole.organizationRole.performer;

import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.generic.model.ppt.party.Party;

/**
 * 出演者
 */
public class Performer extends Player {

    public <P extends Party, PI extends PerformerInformation> Performer(P aParty, PI aPerformerInformation) {
        super(aParty, aPerformerInformation);

    }

    protected Performer() {
        super();

    }

    public static Performer empty() {
        return new Performer();
    }

}
