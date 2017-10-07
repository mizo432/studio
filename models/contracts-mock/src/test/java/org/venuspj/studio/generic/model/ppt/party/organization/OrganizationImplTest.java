package org.venuspj.studio.generic.model.ppt.party.organization;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class OrganizationImplTest {

    @Test
    public void emptyOrganization() throws Exception {
        Organization target = OrganizationImpl.emptyOrganization();
        assertThat(target)
                .isNotNull();
    }
}
