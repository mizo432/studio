package org.venuspj.studio.view.event.events;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.studio.view.event.EventSummaryViewModel;
import org.venuspj.util.builder.ObjectBuilder;

import java.util.Collection;
import java.util.List;

import static org.venuspj.util.collect.Lists2.*;
import static org.venuspj.util.objects2.Objects2.*;

public class EventsViewModel {

    private List<EventSummaryViewModel> eventSummaries = newArrayList();

    public EventsViewModel(Collection<EventSummaryViewModel> anyEventSummaries) {
        eventSummaries.addAll(anyEventSummaries);
    }

    EventsViewModel() {

    }

    public static EventsViewModel create() {
        return new EventsViewModel();
    }

    public static class Builder extends ObjectBuilder<EventsViewModel, Builder> {
        private List<EventSummaryViewModel> eventSummaries = newArrayList();

        @Override
        protected void apply(EventsViewModel vo, Builder builder) {

        }

        @Override
        protected EventsViewModel createValueObject() {
            return new EventsViewModel(eventSummaries);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder fromEvents(Events anyEvents) {
            if (isNull(anyEvents)) return getThis();
            addConfigurator(builder -> {
                for (Event event : anyEvents)
                    builder.eventSummaries.add(new EventSummaryViewModel
                            .Builder()
                            .fromEvent(event)
                            .build());
            });
            return getThis();

        }
    }
}
