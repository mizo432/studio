package org.venuspj.studio.core.model.role.partyRole.organizationRole.promoter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class PromoterTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PromoterTest.class);

    public static Promoter createDummy() {
        return new Promoter(PromoterIdTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        Promoter target = new Promoter();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Promoter target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + actual);
    }
}
