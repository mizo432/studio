package org.venuspj.util.dateProvider;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 * Created by mizoguchi on 2017/06/23.
 */
public class StaticDateProviderTest {

    private static Logger LOGGER = LoggerFactory.getLogger(StaticDateProviderTest.class);

    @Before
    public void setUp() {
        StaticDateProvider.initialize(LocalDateTime.of(2012, 3, 4, 5, 6, 7, 8));
    }

    @Test
    public void initialize() throws Exception {
        LocalDateTime actual = DateProvider.currentDateTime();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.toString()).isEqualTo("2012-03-04T05:06:07.000000008");
    }


}