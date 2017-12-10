package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;
import org.slf4j.Logger;

import java.time.YearMonth;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.logger.LoggerFactory.*;
import static org.venuspj.util.objects2.Objects2.*;

public class RecordYearMonthTest {

    private static final Logger LOGGER = getLogger();

    public static RecordYearMonth createDummyData(TestDateKind aTestDateKind) {
        return new RecordYearMonth(aTestDateKind.yearMonth());
    }

    @Test
    public void isPresent01() {
        RecordYearMonth target = new RecordYearMonth();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asYearMonth() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asYearMonth())
                .isEqualTo(YearMonth.of(2017, 2));
    }

    @Test
    public void empty() {
        RecordYearMonth target = RecordYearMonth.empty();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void sameValueAs1() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        RecordYearMonth other = RecordYearMonth.empty();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs2() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        RecordYearMonth other = createDummyData(TestDateKind.PAST_DATE);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        RecordYearMonth other = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    @Test
    public void sameValueAs4() {
        RecordYearMonth target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(null))
                .isFalse();
    }

    @Test
    public void constructor1() {
        RecordYearMonth target = new RecordYearMonth("2017-06");
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig());

    }

    @Test
    public void of1() {
        RecordYearMonth target = RecordYearMonth.of(2017, 06);
        LOGGER.debug("target:{}", toStringHelper(target).defaultConfig());

    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public YearMonth yearMonth() {
                return YearMonth.of(2017, 2);
            }
        }, PAST_DATE {
            @Override
            public YearMonth yearMonth() {
                return YearMonth.of(2017, 1);
            }
        };

        public abstract YearMonth yearMonth();
    }
}
