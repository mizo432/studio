package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PrefectureTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PrefectureTest.class);

    public static Prefecture createDummy() {
        return Prefecture.defaultPrefecture();
    }

    @Test
    public void testToString1() throws Exception {
        Prefecture target = new Prefecture();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Prefecture target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}