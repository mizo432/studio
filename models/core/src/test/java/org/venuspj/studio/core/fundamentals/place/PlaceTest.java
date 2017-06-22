package org.venuspj.studio.core.fundamentals.place;

import org.venuspj.studio.core.fundamentals.address.AddressTest;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PlaceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlaceTest.class);

    @Test
    public void testToString1() throws Exception {
        Place target = new Place();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Place{}");
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        Place target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Place{descriptor=Descriptor{name=Name{DUMMY_NAME}, description=Description{DUMMY_DESCRIPTION}}, address=Address{}}");

        LOGGER.debug("actual:" + target.toString());
    }

    public static Place createDummy() {
        return new Place(DescriptorTest.createDummy(), AddressTest.createDummy());
    }
}
