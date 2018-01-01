package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class RecordDateTimeTest {

    public static RecordDateTime createDummyData(TestDateKind aTestDateKind) {
        return new RecordDateTime(aTestDateKind.dateTime());
    }

    @Test
    public void isPresent01() {
        RecordDateTime target = new RecordDateTime();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asDate() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asDate())
                .isEqualTo(new RecordDate(LocalDate.of(2016, 2, 3)));
    }

    @Test
    public void asDateTime() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asDateTime())
                .isEqualTo(LocalDateTime.of(2016, 2, 3, 4, 5, 6, 7));
    }

    @Test
    public void asTime() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asTime())
                .isEqualTo(new RecordTime(LocalTime.of(4, 5, 6, 7)));
    }

    @Test
    public void empty() {
        RecordDateTime target = RecordDateTime.create();
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void now() {
        RecordDateTime target = RecordDateTime.now();
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void sameValueAs1() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDateTime other = RecordDateTime.create();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs2() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDateTime other = createDummyData(TestDateKind.PAST_DATE);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordDateTime other = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    @Test
    public void sameValueAs4() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(null))
                .isFalse();
    }

    @Test
    public void hashCode1() {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        int actual = target.hashCode();
        assertThat(actual)
                .isEqualTo(30996995);

    }

    @Test
    public void equals1() throws Exception {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(target);
        assertThat(actual).isTrue();
    }

    @Test
    public void equals2() throws Exception {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(null);
        assertThat(actual).isFalse();
    }

    @Test
    public void equals3() throws Exception {
        RecordDateTime target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual).isFalse();
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