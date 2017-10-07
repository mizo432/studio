package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;
import org.venuspj.ddd.model.entity.EntityIdentifier;

public class PartyIdTest {
    @Test
    public void empty() throws Exception {
        EntityIdentifier<Party> target = PartyId.emptyPartyId();
        System.out.println(target);
    }
}