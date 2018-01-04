package org.venuspj.studio.web.controller.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.venuspj.studio.adapter.presenters.event.events.EventsPagePresenter;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.usecase.event.FetchEventRequest;
import org.venuspj.studio.core.usecase.event.events.FetchEventsUseCase;
import org.venuspj.studio.web.controller.events.requests.EventsPageRequest;

import javax.websocket.server.PathParam;

/**
 * イベント詳細ページ
 */
@RequestMapping("events")
public class EventsController {
    private FetchEventsUseCase fetchEventsUseCase;

    @Autowired
    public EventsController(FetchEventsUseCase aFetchEventsUseCase) {
        fetchEventsUseCase = aFetchEventsUseCase;

    }

    @RequestMapping(path = "/{aEventYearMonth}")
    public String index(@PathParam("aEventYearMonth") String aEventYearMonth, Model model) {
        EventsPagePresenter eventsPagePresenter = new EventsPagePresenter();
        EventsPageRequest eventsPageRequest = new EventsPageRequest(aEventYearMonth);
        fetchEventsUseCase.execute(eventsPageRequest, eventsPagePresenter);

        return eventsPagePresenter.createView()
                .bind(model)
                .getTemplatePath();

    }

}
