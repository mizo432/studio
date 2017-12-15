package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        Profile target = ProfileMock.createDummy(ProfileMock.MockType.LHS);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + toStringHelper(target).defaultConfig().toString());

    }

}
