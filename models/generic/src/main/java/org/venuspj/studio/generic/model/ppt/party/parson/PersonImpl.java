package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;
import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.PartyImpl;

public class PersonImpl extends PartyImpl implements Person, Entity<Party> {

    public <EI extends PartyIdentifier> PersonImpl(EI anIdentifier, PersonInformation aPersonInformation) {
        super(anIdentifier, aPersonInformation);

    }

    public static Person emptyPerson() {
        return new PersonImpl(
                PartyIdentifier.newId(),
                PersonInformation.empty());

    }

    @Override
    public PersonInformation getPersonInfo() {
        return (PersonInformation) super.getPartyInformation();
    }
}
