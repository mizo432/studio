package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.studio.generic.fundamentals.caption.Caption;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class FlyerTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlyerTest.class);

    @Test
    public void testToString1() throws Exception {
        Flyer target = new Flyer();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Flyer{caption=Caption{null}, imagePath=ImagePath{null}}");
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Flyer target = new Flyer(new Caption("Caption"), new ImagePath("ImagePath"));
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Flyer{caption=Caption{Caption}, imagePath=ImagePath{ImagePath}}");
        LOGGER.debug("actual:" + target.toString());
    }

    public static Flyer createDummy() {
        return new Flyer(new Caption("Caption"), new ImagePath("ImagePath"));
    }
}
