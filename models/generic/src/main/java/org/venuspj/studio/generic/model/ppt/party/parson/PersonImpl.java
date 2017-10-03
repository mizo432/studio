package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class PersonImpl extends AbstractEntity<Person> implements Entity<Person>, Person {

    private PersonInfo personInfo;

    public PersonImpl(PersonId anIdentifier, Name name, PersonInfo aPersonInfo) {
        super(anIdentifier);
        personInfo = aPersonInfo;

    }

    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("personId", identifier())
                .add("personInfo", personInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    @Override
    public PersonId getPersonId() {
        return (PersonId) identifier();
    }

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

}
