package org.venuspj.studio.core.model.momentInterval.momemt.event.flyers;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.generic.fundamentals.caption.Caption;

import static org.assertj.core.api.Java6Assertions.*;

public class FlyerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyerTest.class);

    public static Flyer createDummy() {
        return new Flyer(new Caption("Caption"), new ImagePath("ImagePath"));
    }

    @Test
    public void testToString1() throws Exception {
        Flyer target = new Flyer();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Flyer target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void emptyFlyer() throws Exception {
        Flyer target = Flyer.emptyFlyer();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
}
