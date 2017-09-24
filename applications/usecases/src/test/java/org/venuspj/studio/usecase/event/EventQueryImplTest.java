package org.venuspj.studio.usecase.event;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.venuspj.ddd.model.repository.EntityNotFoundRuntimeException;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.model.event.EventRepositoryMock;
import org.venuspj.studio.core.model.event.flyers.EventIdMock;
import org.venuspj.studio.core.model.event.flyers.EventsMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.party.PlayerRepository;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayerRepositoryMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.player.PlayersMock;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

import java.util.List;

import static org.assertj.core.api.Java6Assertions.*;

public class EventQueryImplTest {

    EventQueryUseCase tergetUsecase;

    @Before
    public void setUp() throws Exception {
        List<Event> eventList = EventsMock.createDummy(EventsMock.EventsType.DEFAULT).asList();
        System.out.println("eventList:" + eventList);
        EventRepository eventRepository = new EventRepositoryMock(eventList);
        PlayerRepository playerRepository = new PlayerRepositoryMock(PlayersMock.createDummy(PlayersMock.PlayersType.ALL_PLAYER));
        tergetUsecase = new EventQuery(eventRepository, playerRepository);
    }

    @After
    public void tearDown() throws Exception {
        tergetUsecase = null;
    }


    @Test
    public void start1() throws Exception {
        EventQueryInputPort eventQueryInputPort = new EventQueryInputPortMock(EventIdMock.createDummy(EventIdMock.EventIDType.EVENT_ON_TODAY));
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPortMock();
        tergetUsecase.withEventQueryInputPort(eventQueryInputPort)
                .withEventQueryOutputPort(eventQueryOutputPort).start();
        assertThat(eventQueryInputPort)
                .isNotNull();
        System.out.println(eventQueryOutputPort);


    }

    @Test(expected = EntityNotFoundRuntimeException.class)
    public void start2() throws Exception {
        EventQueryInputPort eventQueryInputPort = new EventQueryInputPortMock(EventIdMock.createDummy(EventIdMock.EventIDType.NOT_FOUND));
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPortMock();
        tergetUsecase.withEventQueryInputPort(eventQueryInputPort)
                .withEventQueryOutputPort(eventQueryOutputPort).start();
        assertThat(eventQueryInputPort)
                .isNotNull();
        System.out.println(eventQueryOutputPort);


    }
}
