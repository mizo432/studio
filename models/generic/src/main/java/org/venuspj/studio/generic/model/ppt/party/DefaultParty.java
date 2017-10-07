package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.EntityIdentifier;

/**
 */
public class DefaultParty extends PartyImpl implements Party {

    private DefaultParty(EntityIdentifier<Party> anIdentifier, PartyInfo aPartyInfo) {
        super(anIdentifier, aPartyInfo);
    }

    public static Party emptyParty() {
        return new DefaultParty(PartyId.emptyPartyId(), PartyInfo.emptyPartyInfo());
    }


}
