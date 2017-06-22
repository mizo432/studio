package org.venuspj.studio.core.fundamentals.descriptor;

import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.studo.generic.fundamentals.description.Description;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DescriptorTest {
    private static Logger LOGGER = LoggerFactory.getLogger(DescriptorTest.class);

    @Test
    public void testToString01() {
        Descriptor target = new Descriptor();
        LOGGER.debug("actual:" + target);
    }

    @Test
    public void testToString02() {
        Descriptor target = createDummy();
        LOGGER.debug("actual:" + target);
    }

    public static Descriptor createDummy() {
        Name name = new Name("DUMMY_NAME");
        Description desc = new Description("DUMMY_DESCRIPTION");
        Descriptor target = new Descriptor(name, desc);
        return new Descriptor(name, desc);
    }


}
