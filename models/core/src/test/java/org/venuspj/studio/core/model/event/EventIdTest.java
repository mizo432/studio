package org.venuspj.studio.core.model.event;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;


/**
 */
public class EventIdTest {

    public static EventId createDummy() {
        return new EventId(1);
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
        EventId target = createDummy();
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
}