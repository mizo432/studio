package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;

public class PartyIdTest {
    @Test
    public void empty() throws Exception {
        PartyId target = PartyId.empty();
        System.out.println(target);
    }

    @Test
    public void constructor() throws Exception {
        PartyId target = new PartyId("DUMMY");
        System.out.println(target);
    }


}