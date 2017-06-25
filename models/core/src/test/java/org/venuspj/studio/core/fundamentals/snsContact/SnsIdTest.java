package org.venuspj.studio.core.fundamentals.snsContact;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 * Created by mizoguchi on 2017/06/25.
 */
public class SnsIdTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SnsIdTest.class);

    public static SnsId createDummy() {
        return new SnsId("lionhouse11111");
    }

    @Test
    public void testToString1() throws Exception {
        SnsId target = new SnsId();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        SnsId target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
    
    @Test
    public void asText() throws Exception {
        SnsId target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}