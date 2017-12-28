package org.venuspj.studio.view.event;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;
import org.venuspj.studio.view.event.events.EventsViewModel;
import org.venuspj.studio.view.product.products.ProductsViewModel;

public class EventPage implements SpringView<EventViewModel> {
    private static final String EVENT_PAGE_TEMPLATE = "/event";

    private EventViewModel event;
    private EventsViewModel events;
    private ProductsViewModel products;

    @Override
    public String getTemplatePath() {
        return EVENT_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<EventViewModel> bind(Model model) {
        model.addAttribute("event", event);
        model.addAttribute("events", events);
        model.addAttribute("products", products);
        return this;
    }

    @Override
    public View<EventViewModel> setViewModel(EventViewModel aViewModel) {
        event = aViewModel;
        return this;
    }

    public void setViewModel(EventsViewModel anEventsViewModel) {
        events = anEventsViewModel;
    }

    public void setViewModel(ProductsViewModel aProductsViewModel) {
        products = aProductsViewModel;

    }
}
