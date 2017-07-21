package org.venuspj.studio.core.fundamentals.note;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class NoteTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(NoteTest.class);

    @Test
    public void testToString1() throws Exception {
        Note target = new Note();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Note target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    public static Note createDummy() {
        return new Note("DUMMY_NOTE");
    }
}
