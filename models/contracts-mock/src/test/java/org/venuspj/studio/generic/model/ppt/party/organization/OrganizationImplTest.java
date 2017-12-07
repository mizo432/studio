package org.venuspj.studio.generic.model.ppt.party.organization;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class OrganizationImplTest {

    @Test
    public void emptyOrganization() throws Exception {
        Organization target = OrganizationImpl.empty();
        assertThat(target)
                .isNotNull();
    }

    @Test
    public void lhsOrganization() throws Exception {
        Organization target = OrganizationMock.createDimmy(OrganizationMock.MockType.LIONHOUSE_STUDIO);
        assertThat(target)
                .isNotNull();
        System.out.println(toStringHelper(target).defaultConfig().toString());
    }
}
