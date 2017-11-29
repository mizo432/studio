package org.venuspj.studio.generic.model.ppt.party.parson;

import org.venuspj.ddd.model.entity.Entity;
import org.venuspj.studio.generic.model.ppt.party.Party;

public interface Person extends Party<Person>, Entity<Person> {
    PersonInfo getPersonInfo();

}
