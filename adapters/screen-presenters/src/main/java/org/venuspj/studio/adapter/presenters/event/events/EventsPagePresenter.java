package org.venuspj.studio.adapter.presenters.event.events;

import org.venuspj.cleanArchitecture.presentation.Presenter;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.core.usecase.event.events.FetchEventsResponse;
import org.venuspj.studio.view.event.events.EventsViewModel;

/**
 * イベントページ用のプレゼンター
 */
public class EventsPagePresenter implements Presenter<EventsPage>, FetchEventsResponse {

    private Events events;

    @Override
    public EventsPage createView() {
        EventsPage view = new EventsPage();
        view.setViewModel(createEventsViewModel());
        return view;
    }

    private EventsViewModel createEventsViewModel() {
        return new EventsViewModel.Builder()
                .fromEvents(events)
                .build();

    }

    @Override
    public void setEvents(Events anyEvents) {
        events = anyEvents;
    }
}
