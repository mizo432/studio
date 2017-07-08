package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.model.event.eventOutline.OutlineTest;
import org.venuspj.studio.core.model.event.flyers.FlyersTest;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 */
public class EventTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventTest.class);

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
        Event target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }

    public static Event createDummy() {
        return new Event(OutlineTest.createDummy(),
                DescriptorTest.createDummy(),
                FlyersTest.createDummy());
    }

}