package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

public class PersonImpl extends PartyImpl implements Person, Entity<Party> {

    public <EI extends PartyIdentifier> PersonImpl(EI anIdentifier, PersonInfo aPersonInfo) {
        super(anIdentifier, aPersonInfo);

    }

    public static Person emptyPerson() {
        return new PersonImpl(
                PartyIdentifier.newId(),
                PersonInfo.empty());

    }

    @Override
    public PersonInfo getPersonInfo() {
        return (PersonInfo) super.getPartyInformation();
    }
}
