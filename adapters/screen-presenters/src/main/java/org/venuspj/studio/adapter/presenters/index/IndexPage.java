package org.venuspj.studio.adapter.presenters.index;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.index.IndexViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;
import org.venuspj.studio.view.topic.topics.TopicsViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class IndexPage implements SpringView<IndexViewModel> {

    private static final String INDEX_PAGE_TEMPLATE = "/index";
    private TopicsViewModel news;
    private EventsViewModel events;
    private ProductsViewModel products;

    public IndexPage(TopicsViewModel anyNews, EventsViewModel anyEvents, ProductsViewModel anyProducts) {
        news = anyNews;
        events = anyEvents;
        products = anyProducts;
    }

    @Override
    public String getTemplatePath() {
        return INDEX_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<IndexViewModel> bind(Model model) {
        model.addAttribute("news", news);
        model.addAttribute("events", events);
        model.addAttribute("products", products);
        return this;
    }

    @Override
    public View<IndexViewModel> setViewModel(IndexViewModel aViewModel) {
        news = aViewModel.getNews();
        events = aViewModel.getEvents();
        products = aViewModel.getProducts();
        return this;
    }

    public static class Builder extends ObjectBuilder<IndexPage, Builder> {
        private TopicsViewModel news;
        private EventsViewModel events;
        private ProductsViewModel products;

        @Override
        protected void apply(IndexPage vo, Builder builder) {

        }

        @Override
        protected IndexPage createValueObject() {
            return new IndexPage(news, events, products);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder withEvents(EventsViewModel anyEvents) {
            if (isNull(anyEvents)) return getThis();
            addConfigurator(builder -> builder.events = anyEvents);
            return getThis();
        }

        public Builder withProducts(ProductsViewModel anyProducts) {
            if (isNull(anyProducts)) return getThis();
            addConfigurator(builder -> builder.products = anyProducts);
            return getThis();

        }

        public Builder withNews(TopicsViewModel anyNews) {
            if (isNull(anyNews)) return getThis();
            addConfigurator(builder -> builder.news = anyNews);
            return getThis();
        }
    }
}
