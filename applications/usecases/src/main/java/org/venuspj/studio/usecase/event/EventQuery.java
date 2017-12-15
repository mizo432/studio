package org.venuspj.studio.usecase.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class EventQuery implements EventQueryUseCase {

    private EventRepository eventRepository;

    @Autowired
    public EventQuery(EventRepository anEventRepository) {
        eventRepository = anEventRepository;
    }

    @Override
    public void execute(EventQueryInputPort request, EventQueryOutputPort response) {
        EventIdentifier eventIdentifier = request.getEventIdentifier();

        Event event = eventRepository.resolve(eventIdentifier);

        response.setEvent(event);

    }
}
