package org.venuspj.studio.generic.model.ppt.party.person;

import org.junit.Test;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;

import static org.venuspj.util.objects2.Objects2.*;

public class PersonTest {
    @Test
    public void constructor() {
        Person target = PersonMock.createDummy(PersonMock.MockType.PLAYER_MEMBER1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
