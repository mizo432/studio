package org.venuspj.studio.usecase.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.model.event.EventRepository;
import org.venuspj.studio.core.usecase.event.FetchEventRequest;
import org.venuspj.studio.core.usecase.event.FetchEventResponse;
import org.venuspj.studio.core.usecase.event.FetchEventUseCase;

/**
 * イベント詳細画面用表示用ユースケース
 */
@Service
public class FetchEvent implements FetchEventUseCase {

    private EventRepository eventRepository;

    @Autowired
    public FetchEvent(EventRepository anEventRepository) {
        eventRepository = anEventRepository;
    }

    @Override
    public void execute(FetchEventRequest request, FetchEventResponse response) {

        EventIdentifier eventIdentifier = request.getEventIdentifier();

        Event event = eventRepository.resolve(eventIdentifier);

        response.setEvent(event);

    }
}
