package org.venuspj.studio.generic.model.ppt.any;

import org.junit.Test;
import org.slf4j.Logger;

import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class AnyImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void test01() throws Exception {
        Any target = new AnyImpl(new AnyIdentifier(1));
        LOGGER.debug("target:{}", toStringHelper(target)
                .addAllDeclaredFields()
                .omitNullValues()
                .multiLine()
                .toString());
    }

}