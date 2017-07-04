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
    public void equals1() {
        StudioCode target = new StudioCode();
        assertThat(target.equals(new StudioCode())).isTrue();

    }

    @Test
    public void equals2() {
        StudioCode target = createDummy();
        assertThat(target.equals(new StudioCode())).isFalse();

    }
    @Test
    public void hashCode1() {
        StudioCode target = new StudioCode();
        assertThat(target.hashCode()).isEqualTo(441573456);

    }

    @Test
    public void hashCode2() {
        StudioCode target = createDummy();
        assertThat(target.hashCode()).isEqualTo(441648807);

    }

    public static StudioCode createDummy() {
        return new StudioCode("LHS");
    }
}
