package org.venuspj.studio.generic.fundamentals.datetime;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalTime;

import static org.assertj.core.api.Java6Assertions.*;

public class RecordTimeTest {

    private Logger LOGGER = LoggerFactory.getLogger(RecordTimeTest.class);

    public static RecordTime createDummyData(TestTimeKind aTestDateKind) {
        return new RecordTime(aTestDateKind.time());
    }

    @Test
    public void isPresent01() {
        RecordTime target = new RecordTime();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        assertThat(target.isPresent())
                .isTrue();
    }

    @Test
    public void asDate() {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
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
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        RecordTime other = RecordTime.empty();
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs2() {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        RecordTime other = createDummyData(TestTimeKind.PAST_TIME);
        assertThat(target.sameValueAs(other))
                .isFalse();
    }

    @Test
    public void sameValueAs3() {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        RecordTime other = createDummyData(TestTimeKind.BASE_TIME);
        assertThat(target.sameValueAs(other))
                .isTrue();
    }

    @Test
    public void sameValueAs4() {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        assertThat(target.sameValueAs(null))
                .isFalse();
    }

    @Test
    public void hashCode1() throws Exception {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        int actual = target.hashCode();
        assertThat(actual).isEqualTo(31979903);

    }

    @Test
    public void equals1() throws Exception {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        boolean actual = target.equals(target);
        assertThat(actual).isTrue();
    }

    @Test
    public void equals2() throws Exception {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        boolean actual = target.equals(null);
        assertThat(actual).isFalse();
    }

    @Test
    public void equals3() throws Exception {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual).isFalse();
    }

    @Test
    public void toString1() throws Exception {
        RecordTime target = createDummyData(TestTimeKind.BASE_TIME);
        LOGGER.debug("actual:" + target.toString());
    }

    public enum TestTimeKind {
        BASE_TIME {
            @Override
            public LocalTime time() {
                return LocalTime.of(4, 5, 6);
            }
        }, PAST_TIME {
            @Override
            public LocalTime time() {
                return LocalTime.of(4, 5, 6, 7);
            }
        };

        public abstract LocalTime time();
    }

}
