package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class RecordDateTest {

    public static RecordDate createDummyData(TestDateKind aTestDateKind) {
        return new RecordDate(aTestDateKind.date());
    }

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

    @Test
    public void sameValueAs4() {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(target))
                .isTrue();
    }

    @Test
    public void sameValueAs5() {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(null))
                .isFalse();
    }

    @Test
    public void hashCode1() throws Exception {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        int actual = target.hashCode();
        assertThat(actual).isEqualTo(4128930);

    }

    @Test
    public void equals1() throws Exception {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(target);
        assertThat(actual).isTrue();
    }

    @Test
    public void equals2() throws Exception {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual).isFalse();
    }

    @Test
    public void equals3() throws Exception {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        RecordDate other = createDummyData(TestDateKind.PAST_DATE);
        boolean actual = target.equals(other);
        assertThat(actual).isFalse();
    }

    @Test
    public void equals4() throws Exception {
        RecordDate target = createDummyData(TestDateKind.BASE_DATE);
        boolean actual = target.equals(null);
        assertThat(actual).isFalse();
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