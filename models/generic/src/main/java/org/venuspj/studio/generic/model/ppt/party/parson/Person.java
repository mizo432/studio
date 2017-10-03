package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.studio.generic.model.ppt.party.Party;

public interface Person extends Party<Person> {
    PersonId getPersonId();

    PersonInfo getPersonInfo();

}
