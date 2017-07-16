package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.venuspj.ddd.model.repository.CrudRepository;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.ddd.model.repository.OnMemoryCrudRepository;
import org.venuspj.studio.core.model.momentInterval.momemt.event.Event;
import org.venuspj.studio.core.model.momentInterval.momemt.event.EventsMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Player;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.Players;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

import static org.assertj.core.api.Java6Assertions.*;

public class EventQueryImplTest {

    EventQueryUseCase tergetUsecase;

    @Before
    public void setUp() throws Exception {
        CrudRepository<Event> eventRepository = new OnMemoryCrudRepository<Event>(EventsMock.createDummy(EventsMock.EventsType.DEFAULT));
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
        System.out.println(eventQueryOutputPort);


    }
}
