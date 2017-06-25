package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 * Created by mizoguchi on 2017/06/25.
 */
public class SnsContactTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SnsContactTest.class);

    public static SnsContact createDummy() {
        return new SnsContact(SnsKind.TWITTER, SnsIdTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        SnsContact target = new SnsContact();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        SnsContact target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}