package org.venuspj.studio.adapter.presenters.index;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;

public class IndexPagePresenter implements Presenter<IndexPage>, FetchEventsResponse {
    private EventsViewModel eventsViewModel;
    private ProductsViewModel productsViewModel;
    private TopicsViewModel topicsViewModel;


    @Override
    public IndexPage createView() {
        return new IndexPage
                .Builder()
                .withEvents(eventsViewModel)
                .withProducts(productsViewModel)
                .withNews(topicsViewModel)
                .build();
    }

    @Override
    public void setEvents(Events events) {

    }
}
