package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.venuspj.ddd.model.entity.DefaultEntityIdentifier;

import java.util.UUID;

import static org.assertj.core.api.Java6Assertions.*;


/**
 */
public class EventIdTest {

    public static EventId createDummy(EventIdType anEventIdType) {
        return new EventId(anEventIdType.createId());
    }

    @Test
    public void toString01() throws Exception {
        EventId target = new EventId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void toString02() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
    }

    @Test
    public void isPresent() throws Exception {
        EventId target = new EventId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void defaultEventId() throws Exception {
        EventId target = EventId.defaultEventId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);

    }

    @Test
    public void equals1() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        boolean actual = target.equals(null);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals2() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        boolean actual = target.equals(target);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals3() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        EventId other = createDummy(EventIdType.DEFAULT);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isTrue();
    }

    @Test
    public void equals4() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        EventId other = createDummy(EventIdType.DEFAULT_SAME_EVENT);
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals5() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        boolean actual = target.equals(Integer.valueOf(1));
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void equals6() throws Exception {
        EventId target = createDummy(EventIdType.DEFAULT);
        DefaultEntityIdentifier<Event> other = new DefaultEntityIdentifier<>(Event.class, UUID.randomUUID());
        boolean actual = target.equals(other);
        assertThat(actual)
                .isFalse();
    }

    public static enum EventIdType {
        DEFAULT {
            @Override
            public Integer createId() {
                return 1;
            }
        }, DEFAULT_SAME_EVENT {
            @Override
            public Integer createId() {
                return 2;
            }
        };

        public abstract Integer createId();
    }
}