package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

public class PersonImpl extends PartyImpl implements Person {

    private PersonInfo personInfo;

    public PersonImpl(EntityIdentifier<Party> anIdentifier, PersonInfo aPersonInfo) {
        super(anIdentifier, aPersonInfo);
        personInfo = aPersonInfo;

    }

    public static Person emptyPerson() {
        return new PersonImpl(
                DefaultEntityIdentifier.newId(Party.class),
                PersonInfo.emptyPersonInfo());

    }

    @Override
    protected Objects2.ToStringHelper string() {
        return toStringHelper(this)
                .add("identifier", identifier())
                .add("personInfo", personInfo);

    }

    @Override
    public String toString() {
        return string()
                .omitNullValues()
                .toString();
    }

    @Override
    public PersonInfo getPersonInfo() {
        return personInfo;
    }
}
