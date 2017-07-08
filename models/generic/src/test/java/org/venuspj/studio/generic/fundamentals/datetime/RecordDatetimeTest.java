package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class RecordDatetimeTest {

    public static RecordDatetime createDummyData(TestDateKind aTestDateKind) {
        return new RecordDatetime(aTestDateKind.dateTime());
    }

    @Test
    public void isPresent01() {
        RecordDatetime target = new RecordDatetime();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asDate() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asDate())
                .isEqualTo(new RecordDate(LocalDate.of(2016, 2, 3)));
    }

    @Test
    public void asDateTime() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asDateTime())
                .isEqualTo(LocalDateTime.of(2016, 2, 3, 4, 5, 6, 7));
    }

    @Test
    public void asTime() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asTime())
                .isEqualTo(new RecordTime(LocalTime.of(4, 5, 6, 7)));
    }

    @Test
    public void empty() {
        RecordDatetime target = RecordDatetime.empty();
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void now() {
        RecordDatetime target = RecordDatetime.now();
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void sameValueAs1() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDatetime other = RecordDatetime.empty();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs2() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDatetime other = createDummyData(TestDateKind.PAST_DATE);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDatetime other = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    @Test
    public void sameValueAs4() {
        RecordDatetime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(null))
                .isFalse();
    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public LocalDateTime dateTime() {
                return LocalDateTime.of(2016, 2, 3, 4, 5, 6, 7);
            }
        }, PAST_DATE {
            @Override
            public LocalDateTime dateTime() {
                return LocalDateTime.of(2016, 1, 3, 4, 5, 6, 7);
            }
        };

        public abstract LocalDateTime dateTime();
    }
}