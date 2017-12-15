package org.venuspj.studio.generic.model.ppt.party.person;

import org.venuspj.studio.generic.model.ppt.party.PartyIdentifier;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.ppt.party.parson.PersonImpl;

public class PersonMock {
    public static Person createDummy(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        PLAYER_MEMBER1 {
            @Override
            public Person create() {
                return new PersonImpl(new PartyIdentifier(1),
                        PersonInformationMock.create(PersonInformationMock.MockType.PLAYER_NUMBER1));
            }
        };

        public abstract Person create();
    }
}
