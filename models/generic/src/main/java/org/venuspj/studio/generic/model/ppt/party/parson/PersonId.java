package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.studio.generic.model.ppt.party.PartyId;
import org.venuspj.util.uuidProvider.UuidProvider;

public class PersonId extends PartyId<Person> {

    PersonId() {
        super(Person.class);

    }

    public PersonId(String aValue) {
        super(aValue);

    }

    public static PersonId newId() {
        return new PersonId(UuidProvider.randomUUID().toString());
    }

    public static PersonId empty() {
        return new PersonId();
    }

}
