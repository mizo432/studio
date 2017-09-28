package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class PersonId extends PartyId implements EntityIdentifier<Party> {

    public PersonId(String aValue) {
        super(aValue);

    }

    public static PersonId newId() {
        return new PersonId(UuidProvider.randomUUID().toString());
    }

    public static PersonId empty() {
        return new PersonId(null);
    }

}
