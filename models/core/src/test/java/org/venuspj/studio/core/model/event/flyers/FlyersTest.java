package org.venuspj.studio.core.model.event.flyers;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;
import org.venuspj.util.collect.Lists2;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class FlyersTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyersTest.class);

    public static Flyers createDummy() {
        return new Flyers(Lists2.newArrayList(FlyerTest.createDummy()));
    }

    @Test
    public void testToString1() throws Exception {
        Flyers target = new Flyers();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Flyers target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
}
