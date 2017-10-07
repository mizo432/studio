package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class PartyId {

    public static EntityIdentifier<Party> emptyPartyId() {
        return DefaultEntityIdentifier.emptyIdentifier(Party.class);
    }

    public static EntityIdentifier<Party> newId() {
        return DefaultEntityIdentifier.newId(Party.class);
    }

}
