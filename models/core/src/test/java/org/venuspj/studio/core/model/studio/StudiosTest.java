package org.venuspj.studio.core.model.studio;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateProvider;
import org.venuspj.util.list2.Lists2;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class StudiosTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudiosTest.class);

    @Test
    public void testToString1() {
        Studios target = new Studios();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }
    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Studios target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    public static Studios createDummy() {
        return new Studios(Lists2.newArrayList(StudioTest.createDummy()));
    }

}