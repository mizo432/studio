package jp.or.venuspj.studio.core.fundamentals.descriptor;

import jp.or.venuspj.studio.core.fundamentals.name.Name;
import jp.or.venuspj.studo.generic.fundamentals.description.Description;
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
        Name name = new Name("DUMMY_NAME");
        Description desc = new Description("DUMMY_DESCRIPTION");
        Descriptor target = new Descriptor(name,desc);
        LOGGER.debug("actual:" + target);
    }
}
