package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.venuspj.studio.core.model.event.*;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class EventQueryTest {
    EventQuery targetUseCase;

    @Before
    public void setUp() {
        targetUseCase = new EventQuery(EventRepositoryMock.create());
    }

    @After
    public void tearDownUp() {
        targetUseCase = null;
    }

    @Test
    public void start() throws Exception {
        EventIdentifier eventId = (EventIdentifier) EventMock.createDummy(EventMock.EventType.EVENT_ON_TODAY).identifier();
        EventQueryInputPort in = new EventQueryInputPortMock(eventId);
        EventQueryOutputPortMock out = new EventQueryOutputPortMock();
        targetUseCase.execute(in, out);
        assertThat(out)
                .isNotNull();
        Event event = out.getEvent();
        assertThat(event)
                .isNotNull();
        assertThat(event.identifier())
                .isNotNull()
                .isEqualTo(eventId);
        System.out.println(toStringHelper(event).defaultConfig().toString());

    }

}
