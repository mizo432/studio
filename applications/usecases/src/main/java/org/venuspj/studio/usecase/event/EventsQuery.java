package org.venuspj.studio.usecase.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.EventCriteria;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.usecase.event.EventsQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventsQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventsQueryUseCase;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class EventsQuery implements EventsQueryUseCase {

    private EventRepository eventRepository;

    @Autowired
    public EventsQuery(EventRepository anEventRepository) {
        eventRepository = anEventRepository;
    }

    @Override
    public void execute(EventsQueryInputPort request, EventsQueryOutputPort response) {
        EventCriteria eventCriteria = request.getEventCriteria();
        Events events = eventRepository.resolveEntities(eventCriteria);
        response.setEvents(events);

    }
}
