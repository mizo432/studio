package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.studio.generic.model.ppt.party.Party;

public class Person extends Party<Person> {
    Person(EntityIdentifier<Person> identifier, Name name) {
        super(identifier, name);
    }

}
