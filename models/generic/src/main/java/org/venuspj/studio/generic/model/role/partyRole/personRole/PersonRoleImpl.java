package org.venuspj.studio.generic.model.role.partyRole.personRole;

import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public abstract class PersonRoleImpl
        extends PartyRoleImpl<Person>
        implements Person, PersonRole<Person> {

    private final Person person;

    public PersonRoleImpl(Person aPerson) {
        super(aPerson);
        person = aPerson;
    }

}
