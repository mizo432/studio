package org.venuspj.studio.adapter.presenters.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.usecase.event.EventQueryOutputPort;

import static org.venuspj.util.objects2.Objects2.*;

public class EventPage implements EventQueryOutputPort {
    private Event event;

    @Override
    public void setEvent(Event anEvent) {
        event = anEvent;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("events", event)
                .omitNullValues()
                .toString();
    }

    public EventPageView getDetail() {
        EventPageView eventPageView = new EventPageView();
        eventPageView.setEventName(event.getInfo().getDescriptor().getName().asText());
        return eventPageView;
    }

    public static class EventPageView {

        private String eventName;

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String aValue) {
            eventName = aValue;
        }

    }


}
