package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.note.NoteTest;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class NewsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(NewsTest.class);

    public static News createDummy() {
        Title title = new Title("DUMMY_TITLE");
        return new News(NewsId.defaultNewsId(), title, NoteTest.createDummy());
    }

    @Test
    public void testToString1() throws Exception {
        News target = new News();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        News target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}
