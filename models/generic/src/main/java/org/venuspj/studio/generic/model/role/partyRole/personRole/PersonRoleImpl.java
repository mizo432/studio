package org.venuspj.studio.generic.model.role.partyRole.personRole;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.role.partyRole.PartyRoleImpl;

public class PersonRoleImpl extends PartyRoleImpl implements Entity<Party>, PersonRole {
    private final Person person;

    public PersonRoleImpl(Person aPerson) {
        super(aPerson);
        person = aPerson;
    }

}
