package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ProfileTest {

    @Test
    public void testToString1() {
        Profile target = new Profile();
        assertThat(target)
                .isNotNull();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);

    }

    @Test
    public void testToString2() throws Exception {
        Profile target = ProfileMock.createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

}
