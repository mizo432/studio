package org.venuspj.studio.core.model.event;

import org.junit.Test;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.studio.core.model.event.flyers.EventIdMock;
import org.venuspj.studio.core.model.event.flyers.EventMock;
import org.venuspj.studio.core.model.event.flyers.EventsMock;

import static org.assertj.core.api.Java6Assertions.*;

public class EventsTest {


    @Test
    public void testToString1() {
        Events target = Events.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);

    }

    @Test
    public void eventRepository() throws Exception {
        EventRepositoryMock repository = new EventRepositoryMock(EventsMock.createDummy(EventsMock.EventsType.DEFAULT).asList());
        System.out.println("repository.findAll()" + repository.asEntitiesList());
        System.out.println("repository.findOne()" + repository.resolve(EventIdMock.createDummy(EventIdMock.EventIDType.EVENT_ON_TODAY)));
        try {
            repository.resolve(EventIdMock.createDummy(EventIdMock.EventIDType.NOT_FOUND));
        } catch (EntityNotFoundRuntimeException e) {
            System.out.println("e:" + e);

        }
        Event otherEvent = EventMock.createDummy(EventMock.EventType.NOT_FOUND);
        repository.contains(otherEvent);
        System.out.println("repository.findOne()" + otherEvent);
        System.out.println("repository.findAll()" + repository.asEntitiesList());
        repository.delete(EventIdMock.createDummy(EventIdMock.EventIDType.NOT_FOUND));
        System.out.println("repository.findAll()" + repository.asEntitiesList());

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

    @Test
    public void iterator() throws Exception {
        Events target = EventsMock.createDummy(EventsMock.EventsType.DEFAULT);
        for (Event event : target) {
            System.out.println("event:" + event);

        }
    }
}
