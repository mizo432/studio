package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.model.momentInterval.momemt.event.eventOutline.OutlineTest;
import org.venuspj.studio.core.model.momentInterval.momemt.event.flyers.FlyersTest;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class EventTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventTest.class);

    public static Event createDummy(EventType anEventType) {
        return new Event(anEventType.createEventId(),
                OutlineTest.createDummy(),
                DescriptorTest.createDummy(),
                FlyersTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        Event target = new Event();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void equals1() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        boolean actual = target.equals(null);
        assertThat(actual)
                .isFalse();

    }

    @Test
    public void equals2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();

    }

    @Test
    public void hashCode1() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        int actual = target.hashCode();
        assertThat(actual)
                .isEqualTo(-1074738147);
    }

    @Test
    public void hashCode2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        int actual = target.hashCode();
        assertThat(actual)
                .isEqualTo(target.identifier().hashCode());
    }

    @Test
    public void equals3() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        Event other = createDummy(EventType.DEFAULT);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();

    }

    @Test
    public void equals4() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = createDummy(EventType.DEFAULT);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual)
                .isFalse();

    }

    public static enum EventType {
        DEFAULT {
            @Override
            public EventId createEventId() {
                return EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT);
            }
        }, OTHER_EVENT {
            @Override
            public EventId createEventId() {
                return EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT_SAME_EVENT);
            }
        };

        public abstract EventId createEventId();
    }
}