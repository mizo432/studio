package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateProvider;
import org.venuspj.util.list2.Lists2;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class EventsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventsTest.class);

    @Test
    public void testToString1() {
        Events target = new Events();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Events target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    public static Events createDummy() {
        return new Events(Lists2.newArrayList(EventTest.createDummy()));
    }
}
