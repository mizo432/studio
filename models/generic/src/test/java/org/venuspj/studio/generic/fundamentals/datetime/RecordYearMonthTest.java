package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.YearMonth;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RecordYearMonthTest {
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
                .isEqualTo(YearMonth.of(2017, 1));
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

    public static RecordYearMonth createDummyData(TestDateKind aTestDateKind) {
        return new RecordYearMonth(aTestDateKind.yearMonth());
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
