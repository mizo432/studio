package org.venuspj.studio.generic.model.ppt;

import org.junit.Test;

public class PartyPlaceThingIdTest {
    @Test
    public void empty() throws Exception {
        PartyPlaceThingId target = PartyPlaceThingId.empty();
        System.out.println(target);
    }

    @Test
    public void constructor() throws Exception {
        PartyPlaceThingId target = new PartyPlaceThingId("DUMMY");
        System.out.println(target);
    }


}