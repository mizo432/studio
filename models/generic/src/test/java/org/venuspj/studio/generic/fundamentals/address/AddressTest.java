package org.venuspj.studio.generic.fundamentals.address;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

public class AddressTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressTest.class);

    public static Address createDummy() {
        return Address.defaultAddress();
    }

    @Test
    public void testToString1() throws Exception {
        Address target = new Address();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Address target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString3() throws Exception {
        Address target = Address.nullAddress();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}
