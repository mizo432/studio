package org.venuspj.studio.generic.model.ppt.party;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.*;

public class AddressUseTest {

    @Test
    public void constructor() {
        AddressUse target = AddressUseMock.createDummy(AddressUseMock.MockType.VENUE1);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
