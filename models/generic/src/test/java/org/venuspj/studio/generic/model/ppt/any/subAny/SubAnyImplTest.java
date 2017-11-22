package org.venuspj.studio.generic.model.ppt.any.subAny;

import org.junit.Test;
import org.slf4j.Logger;

import static org.venuspj.util.logger.LoggerFactory.getLogger;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class SubAnyImplTest {
    private static final Logger LOGGER = getLogger();

    @Test
    public void test01() throws Exception {
        SubAny target = new SubAnyImpl(new SubAnyIdentifier(1));
        LOGGER.debug("target:{}", toStringHelper(target)
                .addAllDeclaredFields()
                .omitNullValues()
                .multiLine()
                .toString());
    }

}