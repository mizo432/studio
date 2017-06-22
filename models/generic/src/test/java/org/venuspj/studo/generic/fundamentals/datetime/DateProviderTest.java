package org.venuspj.studo.generic.fundamentals.datetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class DateProviderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateProviderTest.class);

    @Test
    public void currentDatetime() throws Exception {
        RecordDatetime actual = DateProvider.currentDatetime();
        assertThat(actual).isNotNull();
        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void currentDate() throws Exception {
        RecordDate actual = DateProvider.currentDate();
        assertThat(actual).isNotNull();
        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void currentTime() throws Exception {
        RecordTime actual = DateProvider.currentTime();
        assertThat(actual).isNotNull();
        LOGGER.debug("actual:" + actual);
    }

}