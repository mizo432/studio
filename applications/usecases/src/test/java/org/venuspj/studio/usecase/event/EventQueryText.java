package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.venuspj.ddd.model.entity.EntityIdentifier;
import org.venuspj.studio.core.model.event.*;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;

import static org.assertj.core.api.Java6Assertions.*;

public class EventQueryText {
    EventQuery targetUseCase;

    @Before
    public void setUp() {
        targetUseCase = new EventQuery(new EventRepository() {
            @Override
            public Event resolve(EntityIdentifier<Event> anIdentifier) {
                return EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY);
            }

            @Override
            public Events resolve(Iterable<EntityIdentifier<Event>> anyIdentifiers) {
                return null;
            }

            @Override
            public Events asEntitiesList() {
                return null;
            }

            @Override
            public boolean contains(EntityIdentifier<Event> anIdentifier) {
                return false;
            }

            @Override
            public <S extends Event> boolean contains(S anEntity) {
                return false;
            }

            @Override
            public <S extends Event> void store(S entity) {

            }

            @Override
            public void delete(EntityIdentifier<Event> anIdentifier) {

            }

            @Override
            public void delete(Iterable<EntityIdentifier<Event>> anyIdentifiers) {

            }

            @Override
            public <S extends Event> void delete(S anEntity) {

            }
        });
    }

    @After
    public void tearDownUp() {
        targetUseCase = null;
    }

    @Test
    public void start() throws Exception {
        EventId eventId = (EventId) EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY).identifier();
        EventQueryInputPort in = new EventQueryInputPortMock(eventId);
        EventQueryOutputPortMock out = new EventQueryOutputPortMock();
        targetUseCase.start(in, out);
        assertThat(out)
                .isNotNull();
        Event event = out.getEvent();
        assertThat(event)
                .isNotNull();
        assertThat(event.identifier())
                .isNotNull()
                .isEqualTo(eventId);
        System.out.println(event);

    }

}
