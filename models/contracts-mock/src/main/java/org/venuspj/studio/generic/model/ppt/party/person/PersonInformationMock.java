package org.venuspj.studio.generic.model.ppt.party.person;

import org.venuspj.studio.generic.model.ppt.party.parson.PersonInformation;

public class PersonInformationMock {
    public static PersonInformation create(MockType aMockType) {
        return aMockType.create();
    }

    public enum MockType {
        PLAYER_NUMBER1 {
            @Override
            public PersonInformation create() {
                return PersonInformation.empty();
            }
        };

        public abstract PersonInformation create();
    }
}
