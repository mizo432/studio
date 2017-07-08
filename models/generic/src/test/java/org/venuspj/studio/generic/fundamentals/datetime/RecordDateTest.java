package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class RecordDateTest {

    @Test
    public void isPresent01() {
        RecordDate target = new RecordDate();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordDate target = RecordDateTest.createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asDate() {
        RecordDate target = RecordDateTest.createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asDate())
                .isEqualTo(LocalDate.of(2016, 2, 3));
    }

    @Test
    public void empty() {
        RecordDate target = RecordDate.empty();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void sameValueAs1() {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        RecordDate other = RecordDate.empty();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }
    @Test
    public void sameValueAs2() {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        RecordDate other = createDummyData(TestDateKind.PAST_DATE);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        RecordDate other = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    public static RecordDate createDummyData(TestDateKind aTestDateKind) {
        return new RecordDate(aTestDateKind.date());
    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public LocalDate date() {
                return LocalDate.of(2016, 2, 3);
            }
        }, PAST_DATE {
            @Override
            public LocalDate date() {
                return LocalDate.of(2016, 1, 3);
            }
        };

        public abstract LocalDate date();
    }

}