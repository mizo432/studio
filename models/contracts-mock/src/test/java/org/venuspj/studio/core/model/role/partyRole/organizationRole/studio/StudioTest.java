package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class StudioTest {


    @Test
    public void testToString2() {
        Studio target = StudioMock.createDummy(StudioMock.StudioMockType.EMPTY);
        assertThat(target)
                .isNotNull();

        System.out.println("target:" + target);

    }

}
