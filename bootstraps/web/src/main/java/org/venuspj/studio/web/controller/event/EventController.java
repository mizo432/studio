package org.venuspj.studio.web.controller.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.venuspj.studio.adapter.presenters.event.EventPagePresenter;
import org.venuspj.studio.core.model.event.EventIdentifier;
import org.venuspj.studio.core.usecase.event.FetchEventRequest;
import org.venuspj.studio.core.usecase.event.FetchEventUseCase;
import org.venuspj.studio.core.usecase.event.events.FetchEventsUseCase;
import org.venuspj.studio.core.usecase.product.products.FetchProductsUseCase;

import javax.websocket.server.PathParam;

/**
 * イベント詳細ページ
 */
@RequestMapping("events")
public class EventController {
    private FetchEventUseCase fetchEventUseCase;
    private FetchEventsUseCase fetchEventsUseCase;
    private FetchProductsUseCase fetchProductsUseCase;

    @Autowired
    public EventController(FetchEventUseCase aFetchEventUseCase,
                           FetchEventsUseCase aFetchEventsUseCase,
                           FetchProductsUseCase aFetchProductsUseCase) {

        fetchEventUseCase = aFetchEventUseCase;
        fetchEventsUseCase = aFetchEventsUseCase;
        fetchProductsUseCase = aFetchProductsUseCase;
    }

    @RequestMapping(path = "/{aEventId}")
    public String index(@PathParam("aEventId") Integer aEventId, Model model) {
        EventPagePresenter eventPage = new EventPagePresenter();
        EventQueryCriteria eventQueryCriteria = new EventQueryCriteria(aEventId);
        fetchEventUseCase.execute(eventQueryCriteria, eventPage);
//        fetchEventsUseCase.execute(eventQueryCriteria, eventPage);
//        fetchProductsUseCase.execute(eventQueryCriteria, eventPage);

        return eventPage.createView()
                .bind(model)
                .getTemplatePath();

    }

    static class EventQueryCriteria implements FetchEventRequest {
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
