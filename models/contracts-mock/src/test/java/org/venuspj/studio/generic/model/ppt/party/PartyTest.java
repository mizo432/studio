package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.*;

public class PartyTest {
    @Test
    public void constructor() {
        Party target = PartyMock.createMock(PartyMock.MockType.DEEJEY1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
