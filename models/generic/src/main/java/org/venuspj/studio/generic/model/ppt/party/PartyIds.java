package org.venuspj.studio.generic.model.ppt.party;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifiers;
import org.venuspj.ddd.model.entity.EntityIdentifier;

import java.util.List;

public class PartyIds extends AbstractEntityIdentifiers<Party> {

    public PartyIds(List<? extends EntityIdentifier<Party>> anyPartyIds) {
        super(anyPartyIds);
    }

    private PartyIds() {

    }

    public static PartyIds emptyPartyIds() {
        return new PartyIds();
    }
}
