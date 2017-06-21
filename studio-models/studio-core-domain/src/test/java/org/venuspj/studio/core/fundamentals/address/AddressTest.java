package org.venuspj.studio.core.fundamentals.address;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AddressTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddressTest.class);

    @Test
    public void testToString1() throws Exception {
        Address target = new Address();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Address{}");
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Address target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Address{}");

        LOGGER.debug("actual:" + target.toString());
    }

    public static Address createDummy() {
        return Address.nullAddress();
    }

}
