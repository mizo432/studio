package org.venuspj.studio.usecase.event.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.EventCriteria;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.usecase.event.events.FetchEventsRequest;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.core.usecase.event.events.FetchEventsUseCase;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class FetchEvents implements FetchEventsUseCase {

    private EventRepository eventRepository;

    @Autowired
    public FetchEvents(EventRepository anEventRepository) {
        eventRepository = anEventRepository;
    }

    @Override
    public void execute(FetchEventsRequest request, FetchEventsResponse response) {
        EventCriteria eventCriteria = request.getEventCriteria();
        Events events = eventRepository.resolveEntities(eventCriteria);
        response.setEvents(events);

    }
}
