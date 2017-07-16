package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
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
        OnMemoryCrudRepository<Event> repository = new OnMemoryCrudRepository<Event>(createDummy().list);
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());
        LOGGER.debug("repository.findOne()" + repository.resolve(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT)));
        try {
            repository.resolve(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT_SAME_EVENT));
        } catch (EntityNotFoundRuntimeException e) {
            LOGGER.debug("e:" + e);

        }
        Event otherEvent = EventTest.createDummy(EventTest.EventType.OTHER_EVENT);
        repository.contains(otherEvent);
        LOGGER.debug("repository.findOne()" + otherEvent);
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());
        repository.delete(EventIdTest.createDummy(EventIdTest.EventIdType.DEFAULT_SAME_EVENT));
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());

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
