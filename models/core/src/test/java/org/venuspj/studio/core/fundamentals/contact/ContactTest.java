package org.venuspj.studio.core.fundamentals.contact;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.telNo.TelNoTest;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class ContactTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ContactTest.class);

    public static Contact createDummy() {
        return new Contact(TelNoTest.createDummy(), TelNoTest.createDummy(), HomepageUriTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        Contact target = new Contact();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Contact target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}