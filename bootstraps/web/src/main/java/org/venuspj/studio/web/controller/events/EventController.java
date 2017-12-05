package org.venuspj.studio.web.controller.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.venuspj.studio.adapter.presenters.event.EventPage;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.usecase.event.EventQueryInputPort;
import org.venuspj.studio.core.usecase.event.EventQueryUseCase;

import javax.websocket.server.PathParam;

/**
 * イベント詳細ページ
 */
@RequestMapping("events")
public class EventController {
    private EventQueryUseCase eventQueryUseCase;

    @Autowired
    public EventController(EventQueryUseCase aEventQueryUseCase) {
        eventQueryUseCase = aEventQueryUseCase;
    }

    @RequestMapping(path = "/{aEventId}")
    public String index(@PathParam("aEventId") Integer aEventId, Model model) {
        EventPage eventPage = new EventPage();
        EventQueryCriteria eventQueryCriteria = new EventQueryCriteria(aEventId);
        eventQueryUseCase.start(eventQueryCriteria, eventPage);
        model.addAttribute("page", eventPage.getDetail());

        return "/events/detail";
    }

    static class EventQueryCriteria implements EventQueryInputPort {
        EventIdentifier eventId = EventIdentifier.empty();

        public EventQueryCriteria(Integer aEventId) {
            eventId = new EventIdentifier(aEventId);
        }

        @Override
        public EventIdentifier getEventIdentifier() {
            return eventId;
        }
    }
}
