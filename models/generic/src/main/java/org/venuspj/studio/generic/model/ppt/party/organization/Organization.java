package org.venuspj.studio.generic.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class Organization extends Party {
    public Organization(EntityIdentifier<Party> identifier, Name name) {
        super(identifier, name);
    }

}
