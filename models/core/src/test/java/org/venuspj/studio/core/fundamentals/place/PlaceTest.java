package org.venuspj.studio.core.fundamentals.place;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.address.AddressTest;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;

import static org.assertj.core.api.Java6Assertions.*;

public class PlaceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceTest.class);

    public static Place createDummy() {
        return new Place(DescriptorTest.createDummy(), AddressTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        Place target = new Place();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Place target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
}
