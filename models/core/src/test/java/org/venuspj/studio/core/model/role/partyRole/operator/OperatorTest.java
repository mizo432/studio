package org.venuspj.studio.core.model.role.partyRole.operator;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Java6Assertions.*;

public class OperatorTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(OperatorTest.class);

    public static Operator createDummy() {
        return new Operator(OperatorIdTest.createDummy());
    }

    @Test
    public void toString01() throws Exception {
        Operator target = new Operator();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void toString02() throws Exception {
        Operator target = createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}
