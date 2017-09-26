package org.venuspj.studio.core.model.ppt.party.organization;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.ppt.party.Party;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class Organization extends Party {

    public Organization(EntityIdentifier<Party> anIdentifier, Name aName) {
        super(anIdentifier, aName);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
