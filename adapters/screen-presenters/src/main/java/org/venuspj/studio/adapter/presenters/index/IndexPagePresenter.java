package org.venuspj.studio.adapter.presenters.index;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.model.role.thingRole.product.Products;
import org.venuspj.studio.core.model.topic.topics.Topics;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.core.usecase.product.products.FetchProductsResponse;
import org.venuspj.studio.core.usecase.topic.topics.FetchTopicsResponse;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;

public class IndexPagePresenter implements Presenter<IndexPage>, FetchEventsResponse, FetchProductsResponse, FetchTopicsResponse {
    private TopicsViewModel topicsViewModel;
    private EventsViewModel eventsViewModel;
    private ProductsViewModel productsViewModel;

    @Override
    public IndexPage createView() {
        return new IndexPage
                .Builder()
                .withEvents(eventsViewModel)
                .withProducts(productsViewModel)
                .withTopics(topicsViewModel)
                .build();
    }

    @Override
    public void setEvents(Events events) {
        eventsViewModel = new EventsViewModel.Builder().fromEvents(events).build();
    }

    @Override
    public void setProducts(Products anyProducts) {
        productsViewModel = new ProductsViewModel
                .Builder()
                .fromProducts(anyProducts)
                .build();

    }

    @Override
    public void setTopics(Topics anyTopics) {
        topicsViewModel = new TopicsViewModel
                .Builder()
                .from(anyTopics)
                .build();

    }

}
