package org.venuspj.studio.generic.model.ppt.party.organization;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.*;

public class OrganizationUnitTest {
    @Test
    public void emptyOrganizationUnit() throws Exception {
        OrganizationUnit target = OrganizationUnitImpl.empty();
        assertThat(target)
                .isNotNull();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }

    @Test
    public void lhsOrganization() throws Exception {
        OrganizationUnit target = OrganizationUnitMock.create(OrganizationUnitMock.MockType.SOUND1);
        assertThat(target)
                .isNotNull();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
