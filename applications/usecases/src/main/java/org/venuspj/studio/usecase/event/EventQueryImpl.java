package org.venuspj.studio.usecase.event;

import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventCredential;
import org.venuspj.studio.core.repositories.event.EventRepository;
import org.venuspj.studio.core.usecases.UseCaseInteractor;
import org.venuspj.studio.core.usecases.event.EventQuery;
import org.venuspj.studio.core.usecases.event.EventQueryInputPort;
import org.venuspj.studio.core.usecases.event.EventQueryOutputPort;

@Service
public class EventQueryImpl implements EventQuery {

    EventQueryInputPort useCaseInputPort;
    EventRepository eventRepository;
    public EventQueryImpl(EventRepository anEventRepository){
        eventRepository = anEventRepository;
    }

    @Override
    public UseCaseInteractor withInputPort(EventQueryInputPort anUseCaseInputPort) {
        useCaseInputPort = anUseCaseInputPort;

        return this;
    }

    @Override
    public EventQueryOutputPort start() {
        EventCredential credential = useCaseInputPort.toCredential();
        Event event = eventRepository.findOne(credential);
        EventQueryOutputPort eventQueryOutputPort = new EventQueryOutputPort(event);
        return eventQueryOutputPort;
    }

}
