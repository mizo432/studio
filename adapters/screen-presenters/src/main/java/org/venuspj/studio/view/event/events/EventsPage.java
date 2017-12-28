package org.venuspj.studio.view.event.events;

import org.springframework.ui.Model;
import org.venuspj.cleanArchitecture.presentation.View;
import org.venuspj.studio.adapter.presenters.SpringView;

public class EventsPage implements SpringView<EventsViewModel> {
    private static final String EVENTS_PAGE_TEMPLATE = "/events";
    private EventsViewModel events;

    @Override
    public String getTemplatePath() {
        return EVENTS_PAGE_TEMPLATE;
    }

    @Override
    public SpringView<EventsViewModel> bind(Model model) {
        model.addAttribute("events", events);
        return this;
    }

    @Override
    public View<EventsViewModel> setViewModel(EventsViewModel viewModel) {
        events = viewModel;
        return this;
    }
}
