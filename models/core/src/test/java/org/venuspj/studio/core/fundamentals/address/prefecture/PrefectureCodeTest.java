package org.venuspj.studio.core.fundamentals.address.prefecture;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class PrefectureCodeTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PrefectureCodeTest.class);

    public static PrefectureCode createDummy() {
        return new PrefectureCode(12);
    }

    @Test
    public void testToString1() throws Exception {
        PrefectureCode target = new PrefectureCode();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        PrefectureCode target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void asText() throws Exception {
        PrefectureCode target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("12");
    }

    @Test
    public void asInteger() throws Exception {
        PrefectureCode target = createDummy();
        Integer actual = target.asInteger();
        assertThat(actual)
                .isNotNull()
                .isEqualTo(12);
    }

}