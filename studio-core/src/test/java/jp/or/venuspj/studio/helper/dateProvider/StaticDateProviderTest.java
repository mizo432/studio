package jp.or.venuspj.studio.helper.dateProvider;

import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDate;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDatetime;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordTime;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StaticDateProviderTest {
    private static Logger LOGGER = LoggerFactory.getLogger(StaticDateProviderTest.class);
    private DateProvider dateProvider;

    @Before
    public void setUp() {
        dateProvider = new DateProvider(new RecordDatetime(LocalDateTime.of(2012, 3, 4, 5, 6, 7, 8)));
    }

    @Test
    public void currentDate() throws Exception {
        StaticDateProvider.setDateProvider(dateProvider);
        RecordDate actual = StaticDateProvider.currentDate();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordDate{2012-03-04}");

    }

    @Test
    public void currentDatetime() throws Exception {
        StaticDateProvider.setDateProvider(dateProvider);
        RecordDatetime actual = StaticDateProvider.currentDatetime();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordDatetime{2012-03-04T05:06:07.000000008}");
    }

    @Test
    public void currentTime() throws Exception {
        StaticDateProvider.setDateProvider(dateProvider);
        RecordTime actual = StaticDateProvider.currentTime();
        LOGGER.debug("actual:" + actual);
        assertThat(actual).isNotNull();
        assertThat(actual.isPresent()).isTrue();
        assertThat(actual.toString()).isEqualTo("RecordTime{05:06:07.000000008}");
    }

}