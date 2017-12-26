package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.model.role.thingRole.product.Products;
import org.venuspj.studio.core.usecase.event.FetchEventResponse;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.core.usecase.product.products.FetchProductsResponse;
import org.venuspj.studio.view.event.EventPage;
import org.venuspj.studio.view.event.EventViewModel;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;

/**
 * イベントページ用のプレゼンター
 */
public class EventPagePresenter implements Presenter<EventPage>, FetchEventResponse, FetchEventsResponse, FetchProductsResponse {

    private Event event;
    private Events events;
    private Products products;

    @Override
    public EventPage createView() {
        EventPage view = new EventPage();
        view.setViewModel(createEventViewModel());
        view.setViewModel(createEventsViewModel());
        view.setViewModel(createProductsViewModel());
        return view;
    }


    @Override
    public void setEvent(Event anEvent) {
        event = anEvent;
    }

    @Override
    public void setEvents(Events anyEvents) {
        events = anyEvents;
    }

    @Override
    public void setProducts(Products anyProducts) {
        products = anyProducts;
    }

    private EventViewModel createEventViewModel() {
        return new EventViewModel.Builder()
                .withEventName(event.getInfo().getDescriptor().getName().asText())
                .build();
    }

    private ProductsViewModel createProductsViewModel() {
        return new ProductsViewModel.Builder()
                .fromProducts(products)
                .build();
    }

    private EventsViewModel createEventsViewModel() {
        return new EventsViewModel.Builder().fromEvents(events).build();
    }

}
