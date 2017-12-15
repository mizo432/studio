package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class StudioTest {


    @Test
    public void testToString2() {
        Studio target = StudioMock.createDummy(StudioMock.MockType.LHS);
        assertThat(target)
                .isNotNull();

        System.out.println("target:" + toStringHelper(target).defaultConfig().toString());

    }

}
