package org.venuspj.studio.core.fundamentals.address;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class AddressStringTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AddressStringTest.class);

    public static AddressString createDummy() {
        return new AddressString("ADDRESS_STRING");
    }

    @Test
    public void testToString1() throws Exception {
        AddressString target = new AddressString();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        AddressString target = AddressString.emptyAddressString();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString3() throws Exception {
        AddressString target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void asText() throws Exception {
        AddressString target = createDummy();
        String actual = target.asText();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("ADDRESS_STRING");
        LOGGER.debug("actual:" + actual);
    }

}