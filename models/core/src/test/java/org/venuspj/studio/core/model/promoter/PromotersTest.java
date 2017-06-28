package org.venuspj.studio.core.model.promoter;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateProvider;
import org.venuspj.util.list2.Lists2;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class PromotersTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(PromotersTest.class);

    @Test
    public void testToString1() {
        Promoters target = new Promoters();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Promoters target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void empty() throws Exception {
        Promoters target =
                Promoters.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    public static Promoters createDummy() {
        return new Promoters(Lists2.newArrayList(PromoterTest.createDummy()));
    }

}
