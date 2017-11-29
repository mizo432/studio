package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

public class PersonImpl extends PartyImpl<Person> implements Person, Entity<Person> {

    private PersonInfo personInfo;

    public <EI extends EntityIdentifier<Person>> PersonImpl(EntityIdentifier<Person> anIdentifier, PersonInfo aPersonInfo) {
        super(anIdentifier, aPersonInfo);
        personInfo = aPersonInfo;

    }

    public static Person emptyPerson() {
        return new PersonImpl(
                PersonIdentifier.empty(),
                PersonInfo.emptyPersonInfo());

    }

    @Override
    public PersonInfo getPersonInfo() {
        return personInfo;
    }
}
