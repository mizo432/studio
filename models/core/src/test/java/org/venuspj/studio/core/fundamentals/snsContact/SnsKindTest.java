package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 */
public class SnsKindTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SnsKind.class);

    @Test
    public void values() throws Exception {
        SnsKind[] actual = SnsKind.values();
        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void valueOf() throws Exception {
        SnsKind actual = SnsKind.valueOf("TWITTER");
        LOGGER.debug("actual:" + actual);
    }
}