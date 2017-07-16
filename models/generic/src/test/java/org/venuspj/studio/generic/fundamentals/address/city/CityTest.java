package org.venuspj.studio.generic.fundamentals.address.city;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class CityTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CityTest.class);

    public static City createDummy() {
        return City.defaultCity();
    }

    @Test
    public void testToString1() throws Exception {
        City target = new City();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        City target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}