package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventCredential;
import org.venuspj.studio.core.repositories.event.EventRepository;
import org.venuspj.studio.core.usecases.UseCaseOutputPort;
import org.venuspj.studio.core.usecases.event.EventQuery;
import org.venuspj.studio.core.usecases.event.EventQueryInputPort;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class EventQueryImplTest {
    static final Logger LOGGER = LoggerFactory.getLogger(EventQueryImplTest.class);

    EventQuery tergetUsecase;

    @Before
    public void setUp() throws Exception {
        EventRepository eventRepository = new EventRepository() {
            @Override
            public Event findOne(EventCredential credential) {
                return Event.brankEvent();
            }
        };
        tergetUsecase = new EventQueryImpl(eventRepository);
    }

    @After
    public void tearDown() throws Exception {
        tergetUsecase = null;
    }

    @Test
    public void start() throws Exception {
        EventQueryInputPort eventQueryInputPort = new EventQueryInputPort();
        UseCaseOutputPort actual = tergetUsecase.withInputPort(eventQueryInputPort).start();
        assertThat(actual)
                .isNotNull();


    }
}
