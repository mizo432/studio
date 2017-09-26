package org.venuspj.studio.core.model.ppt.party.person;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.ppt.party.Party;
import org.venuspj.studio.generic.fundamentals.name.Name;

public class Person extends Party implements Entity<Party>{

    public Person(EntityIdentifier<Party> anIdentifier, Name aName) {
        super(anIdentifier, aName);
    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

}
