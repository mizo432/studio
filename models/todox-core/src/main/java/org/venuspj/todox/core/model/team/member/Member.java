package org.venuspj.todox.core.model.team.member;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.todox.core.model.team.Teams;

public class Member extends AbstractEntity<Member> {
    Teams teams;
    Person person;

    public Member(EntityIdentifier<Member> identifier, Teams teams, Person aPerson) {
        super(identifier);
        person = aPerson;

    }
}
