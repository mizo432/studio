package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;
import org.venuspj.util.collect.Lists2;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class EventsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventsTest.class);

    public static Events createDummy() {
        return new Events(Lists2.newArrayList(EventTest.createDummy(EventTest.EventType.DEFAULT)));
    }

    @Test
    public void testToString1() {
        Events target = new Events();
        assertThat(target)
                .isNotNull();

        LOGGER.debug("target:" + target);

    }

    @Test
    public void eventRepository() throws Exception {
        OnMemoryCrudRepository<Event, EventId> repository = new OnMemoryCrudRepository<Event, EventId>(createDummy());
        LOGGER.debug("repository.findAll()" + repository.findAll());
        LOGGER.debug("repository.findOne()" + repository.findOne(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT)));
        LOGGER.debug("repository.findOne()" + repository.findOne(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT_SAME_EVENT)));
        Event otherEvent = EventTest.createDummy(EventTest.EventType.OTHER_EVENT);
        repository.save(otherEvent);
        LOGGER.debug("repository.findOne()" + otherEvent);
        LOGGER.debug("repository.findAll()" + repository.findAll());
        LOGGER.debug("repository.findOne()" + repository.drop(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT_SAME_EVENT)));
        LOGGER.debug("repository.findAll()" + repository.findAll());

    }

    @Test
    public void testToString2() throws Exception {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 1, 0, 0, 0, 0));
        Events target = createDummy();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }

    @Test
    public void empty() throws Exception {
        Events target =
                Events.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        LOGGER.debug("actual:" + target.toString());
    }
}
