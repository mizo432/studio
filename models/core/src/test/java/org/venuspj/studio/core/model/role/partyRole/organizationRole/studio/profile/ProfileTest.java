package org.venuspj.studio.core.model.role.partyRole.organizationRole.studio.profile;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.note.NoteTest;

import static org.assertj.core.api.Java6Assertions.*;

public class ProfileTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProfileTest.class);

    public static Profile createDummy() {
        return new Profile(NoteTest.createDummy());
    }

    @Test
    public void testToString1() {
        Profile target = new Profile();
        assertThat(target)
                .isNotNull();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);

    }

    @Test
    public void testToString2() throws Exception {
        Profile target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

}
