package jp.or.venuspj.studo.generic.fundamentals.datetime;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class StaticDateProviderTest {
    private static Logger LOGGER = LoggerFactory.getLogger(StaticDateProviderTest.class);

    @Before
    public void setUp() {
        StaticDateProvider.initialize(LocalDateTime.of(2012, 3, 4, 5, 6, 7, 8));
    }

    @Test
    public void currentDate() throws Exception {
        RecordDate actual = DateProvider.currentDate();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordDate{2012-03-04}");

    }

    @Test
    public void currentDatetime() throws Exception {
        RecordDatetime actual = DateProvider.currentDatetime();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordDatetime{2012-03-04T05:06:07.000000008}");
    }

    @Test
    public void currentTime() throws Exception {
        RecordTime actual = DateProvider.currentTime();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordTime{05:06:07.000000008}");
    }

}