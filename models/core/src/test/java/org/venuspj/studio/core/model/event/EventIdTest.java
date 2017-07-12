package org.venuspj.studio.core.model.event;

import org.junit.Test;

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

    public static enum EventIdType {
        DEFAULT {
            @Override
            public Integer createId() {
                return 1;
            }
        };

        public abstract Integer createId();
    }
}