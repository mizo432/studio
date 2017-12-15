package org.venuspj.studio.generic.model.ppt.party.organization;

import org.junit.Test;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class OrganizationInformationTest {
    @Test
    public void name() {
        OrganizationInformation target = OrganizationInformationMock.createDummy(OrganizationInformationMock.MockType.LHS);
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
