package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.*;

public class PartiesTest {
    @Test
    public void name() {
        Parties target = PartiesMock.create(PartiesMock.MockType.STUDIO_PLAYERS);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

}
