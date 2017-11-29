package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.generic.model.ppt.party.parson.Person;
import org.venuspj.studio.generic.model.ppt.party.parson.PersonIdentifier;

import static org.venuspj.util.objects2.Objects2.*;

public class PersonIdentifierTest {
    @Test
    public void empty() throws Exception {
        EntityIdentifier<Person> target = PersonIdentifier.empty();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}