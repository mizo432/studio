package org.venuspj.util.dateProvider;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class DateProviderTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(DateProviderTest.class);

    @Test
    public void currentDatetime() throws Exception {
        LocalDateTime actual = DateProvider.currentDateTime();
        assertThat(actual).isNotNull();
        LOGGER.debug("actual:" + actual);
    }


}