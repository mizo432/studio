package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class PersonId extends PartyId<Person> {

    public PersonId(String aValue) {
        super(Person.class, aValue);

    }

    public static PersonId newPersonId() {
        return new PersonId(UuidProvider.randomUUID().toString());
    }

    public static PersonId emptyPersonId() {
        return new PersonId(null);
    }

    public String getValue() {
        return value;
    }

}
