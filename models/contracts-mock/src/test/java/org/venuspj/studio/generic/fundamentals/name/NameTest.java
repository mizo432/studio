package org.venuspj.studio.generic.fundamentals.name;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

public class NameTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(NameTest.class);

    public static Name createDummy() {
        return new Name("ANSA");

    }

    @Test
    public void testToString1() throws Exception {
        Name target = new Name();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Name target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void defaultName() throws Exception {
        Name target = Name.defaultName();
        assertThat(target).isNotNull();
        assertThat(target.asText()).isNull();
    }

}
