package org.venuspj.studio.view.index;

import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class IndexViewModel {
    private final ProductsViewModel products;
    private final EventsViewModel events;
    private final TopicsViewModel news;

    public IndexViewModel(ProductsViewModel anyProducts, EventsViewModel anyEvents, TopicsViewModel anyNews) {
        products = anyProducts;
        events = anyEvents;
        news = anyNews;
    }

    public TopicsViewModel getNews() {
        return news;
    }

    public EventsViewModel getEvents() {
        return events;
    }

    public ProductsViewModel getProducts() {
        return products;
    }

    public static class Builder extends ObjectBuilder<IndexViewModel, Builder> {
        private ProductsViewModel products = ProductsViewModel.create();
        private EventsViewModel events = EventsViewModel.create();
        private TopicsViewModel news = TopicsViewModel.create();

        @Override
        protected void apply(IndexViewModel vo, Builder builder) {
            builder.withProducts(vo.getProducts());
            builder.withEvents(vo.getEvents());
            builder.withNews(vo.getNews());

        }

        private Builder withProducts(ProductsViewModel anyProducts) {
            if (isNull(anyProducts)) return getThis();
            addConfigurator(builder -> builder.products = anyProducts);
            return getThis();
        }


        public Builder withEvents(EventsViewModel anyEvents) {
            if (isNull(anyEvents)) return getThis();
            addConfigurator(builder -> builder.events = anyEvents);
            return getThis();
        }

        public Builder withNews(TopicsViewModel anyNews) {
            if (isNull(anyNews)) return getThis();
            addConfigurator(builder -> builder.news = anyNews);
            return getThis();
        }

        @Override
        protected IndexViewModel createValueObject() {
            return new IndexViewModel(products, events, news);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }
    }
}
