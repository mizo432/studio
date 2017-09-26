package org.venuspj.studio.core.model.ppt.party.person;

import org.venuspj.studio.generic.model.ppt.party.PartyId;

public class PersonId extends PartyId {

    public PersonId(String aValue) {
        super(Person.class, aValue);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
