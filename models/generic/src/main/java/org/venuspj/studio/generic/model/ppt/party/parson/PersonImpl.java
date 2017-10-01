package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class PersonImpl extends AbstractEntity<Person> implements Entity<Person> {
    PersonId personId;

    public PersonImpl(PersonId anIdentifier, Name name) {
        super(anIdentifier);
        personId = anIdentifier;
    }

}
