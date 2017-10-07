package org.venuspj.studio.generic.model.role.partyRole.personRole;

import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.ppt.party.parson.PersonImpl;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public abstract class PersonRoleImpl
        extends PartyRoleImpl
        implements Person, PersonRole {

    private final Person person;

    public PersonRoleImpl() {
        this(PersonImpl.emptyPerson());
    }

    public PersonRoleImpl(Person aPerson) {
        super(aPerson);
        person = aPerson;
    }

    @Override
    public abstract Party clone();

}
