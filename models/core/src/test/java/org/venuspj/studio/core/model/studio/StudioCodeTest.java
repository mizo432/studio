package org.venuspj.studio.core.model.studio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class StudioCodeTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudioCodeTest.class);

    @Test
    public void testToString1() {
        StudioCode target = new StudioCode();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void testToString2() {
        StudioCode target = createDummy();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void equalsTest() {
        Studio target = new Studio();
        assertThat(target.equals(new Studio())).isTrue();

    }

    @Test
    public void hashCodeTest() {
        Studio target = new Studio();
        assertThat(target.hashCode()).isEqualTo(31);

    }

    public static StudioCode createDummy() {
        return new StudioCode("LHS");
    }
}
