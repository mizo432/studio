package jp.or.venuspj.studio.core.model.event;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 */
public class EventIdTest {

    @Test
    public void testToString() throws Exception {
        EventId target = new EventId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull()
                .isEqualTo("EventId{null}");
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