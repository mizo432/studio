package org.venuspj.studio.core.fundamentals.telNo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class TelNoTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(TelNoTest.class);

    public static TelNo createDummy() {
        return new TelNo("0120-222-1234");
    }

    @Test
    public void testToString1() throws Exception {
        TelNo target = new TelNo();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        TelNo target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString3() throws Exception {
        TelNo target = TelNo.emptyTelNo();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}