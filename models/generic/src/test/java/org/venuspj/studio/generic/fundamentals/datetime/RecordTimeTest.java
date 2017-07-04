package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class RecordTimeTest {
    @Test
    public void isPresent01() {
        RecordTime target = new RecordTime();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asDate() {
        RecordTime target = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.asTime())
                .isEqualTo(LocalTime.of(4, 5, 6));
    }

    @Test
    public void empty() {
        RecordTime target = RecordTime.empty();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void sameValueAs1() {
        RecordTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordTime other = RecordTime.empty();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }
    @Test
    public void sameValueAs2() {
        RecordTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordTime other = createDummyData(TestDateKind.PAST_DATE);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordTime target = createDummyData(TestDateKind.BASE_DATE);
        RecordTime other = createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    public static RecordTime createDummyData(TestDateKind aTestDateKind) {
        return new RecordTime(aTestDateKind.time());
    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public LocalTime time() {
                return LocalTime.of(4, 5, 6);
            }
        }, PAST_DATE {
            @Override
            public LocalTime time() {
                return LocalTime.of(4, 5, 6,7);
            }
        };

        public abstract LocalTime time();
    }

}
