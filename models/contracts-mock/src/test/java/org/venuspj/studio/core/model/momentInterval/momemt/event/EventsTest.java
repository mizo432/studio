package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;

import static org.assertj.core.api.Java6Assertions.*;

public class EventsTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventsTest.class);


    @Test
    public void testToString1() {
        Events target = new Events();
        assertThat(target)
                .isNotNull();
        System.out.println("target:" + target);

        LOGGER.debug("target:" + target);

    }

    @Test
    public void eventRepository() throws Exception {
        OnMemoryCrudRepository<Event> repository = new OnMemoryCrudRepository<Event>(EventsMock.createDummy(EventsMock.EventsType.DEFAULT).list);
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());
        LOGGER.debug("repository.findOne()" + repository.resolve(EventIdMock.createDummy(EventIdMock.EventIDType.EVENT_ON_TODAY)));
        try {
            repository.resolve(EventIdMock.createDummy(EventIdMock.EventIDType.NOT_FOUND));
        } catch (EntityNotFoundRuntimeException e) {
            LOGGER.debug("e:" + e);

        }
        Event otherEvent = EventMock.createDummy(EventMock.EventType.NOT_FOUND);
        repository.contains(otherEvent);
        LOGGER.debug("repository.findOne()" + otherEvent);
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());
        repository.delete(EventIdMock.createDummy(EventIdMock.EventIDType.NOT_FOUND));
        LOGGER.debug("repository.findAll()" + repository.asEntitiesList());

    }

    @Test
    public void testToString2() throws Exception {
        Events target = EventsMock.createDummy(EventsMock.EventsType.DEFAULT);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void empty() throws Exception {
        Events target =
                Events.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }
}
