package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.AbstractEntityIdentifier;

public class PersonIdentifier extends AbstractEntityIdentifier<Person> {
    private final Integer value;

    PersonIdentifier() {
        super(Person.class);
        value = null;
    }

    PersonIdentifier(Integer aValue) {
        super(Person.class);
        value = aValue;
    }

    public static PersonIdentifier empty() {
        return new PersonIdentifier();
    }
}
