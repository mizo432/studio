package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventCredential;
import org.venuspj.studio.core.model.player.PlayerIds;
import org.venuspj.studio.core.model.player.Players;
import org.venuspj.studio.core.repositories.event.EventRepository;
import org.venuspj.studio.core.repositories.player.PlayerRepository;
import org.venuspj.studio.core.usecases.event.EventQueryInputPort;
import org.venuspj.studio.core.usecases.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecases.event.EventQueryUseCase;

import static org.assertj.core.api.Java6Assertions.*;

public class EventQueryImplTest {
    static final Logger LOGGER = LoggerFactory.getLogger(EventQueryImplTest.class);

    EventQueryUseCase tergetUsecase;

    @Before
    public void setUp() throws Exception {
        EventRepository eventRepository = new EventRepository() {
            @Override
            public Event findOne(EventCredential credential) {
                return Event.blankEvent();
            }
        };

        PlayerRepository playerRepository = new PlayerRepository() {
            @Override
            public Players findByPlayersIds(PlayerIds playerIds) {
                return Players.empty();
            }
        };

        tergetUsecase = new EventQuery(eventRepository, playerRepository);
    }

    @After
    public void tearDown() throws Exception {
        tergetUsecase = null;
    }

    @Test
    public void start() throws Exception {
        EventQueryInputPort eventQueryInputPort = new EventQueryInputPortMock();
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPortMock();
        tergetUsecase.withEventQueryInputPort(eventQueryInputPort)
                .withEventQueryOutputPort(eventQueryOutputPort).start();
        assertThat(eventQueryInputPort)
                .isNotNull();


    }
}
