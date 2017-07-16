package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;
import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

import static org.assertj.core.api.Java6Assertions.*;

public class EventQueryImplTest {
    static final Logger LOGGER = LoggerFactory.getLogger(EventQueryImplTest.class);

    EventQueryUseCase tergetUsecase;

    @Before
    public void setUp() throws Exception {
        CrudRepository<Event> eventRepository = new OnMemoryCrudRepository<Event>();
        CrudRepository<Player> playerRepository = new OnMemoryCrudRepository<Player>(Players.empty().asList());
        tergetUsecase = new EventQuery(eventRepository, playerRepository);
    }

    @After
    public void tearDown() throws Exception {
        tergetUsecase = null;
    }

    @Test(expected = EntityNotFoundRuntimeException.class)
    public void start() throws Exception {
        EventQueryInputPort eventQueryInputPort = new EventQueryInputPortMock();
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPortMock();
        tergetUsecase.withEventQueryInputPort(eventQueryInputPort)
                .withEventQueryOutputPort(eventQueryOutputPort).start();
        assertThat(eventQueryInputPort)
                .isNotNull();


    }
}
