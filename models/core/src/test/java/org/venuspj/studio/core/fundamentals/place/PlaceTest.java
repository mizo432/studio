package org.venuspj.studio.core.fundamentals.place;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.contact.ContactTest;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.fundamentals.snsContact.SnsContactsTest;
import org.venuspj.studio.generic.fundamentals.address.AddressMock;

import static org.assertj.core.api.Java6Assertions.*;

public class PlaceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceTest.class);

    public static Place createDummy() {
        return new Place(DescriptorTest.createDummy(), AddressMock.createDummy(), ContactTest.createDummy(), SnsContactsTest.createDummy());
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
