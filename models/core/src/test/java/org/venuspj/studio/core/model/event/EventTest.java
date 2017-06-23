package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.name.Name;
import org.venuspj.studio.core.model.event.flyers.Flyer;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studo.generic.fundamentals.datetime.DateProvider;
import org.venuspj.studo.generic.fundamentals.datetime.StaticDateProvider;
import org.venuspj.studo.generic.fundamentals.description.Description;
import org.venuspj.util.list2.Lists2;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class EventTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventTest.class);

    @Test
    public void testToString1() throws Exception {
        Event target = new Event();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Event target = new Event(new EventId(1), new Descriptor(new Name("イベント名"), new Description("")), new Flyers(Lists2.newArrayList(Flyer.emptyFlyer())), PlayerIds.empty(), DateProvider.currentDate());
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

}