package org.venuspj.studio.view.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.generic.fundamentals.name.Name;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class EventSummaryViewModel {
    private String eventName;

    EventSummaryViewModel(String anEventName) {

    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String aValue) {
        eventName = aValue;
    }

    public static class Builder extends ObjectBuilder<EventSummaryViewModel, Builder> {
        private String eventName;

        @Override
        protected void apply(EventSummaryViewModel vo, Builder builder) {
            builder.withEventName(vo.getEventName());

        }

        private Builder withEventName(String anEventName) {
            if (isNull(anEventName)) return getThis();
            addConfigurator(builder -> builder.eventName = anEventName);
            return getThis();
        }

        @Override
        protected EventSummaryViewModel createValueObject() {
            return new EventSummaryViewModel(eventName);
        }

        @Override
        protected Builder getThis() {
            return this;
        }

        @Override
        protected Builder newInstance() {
            return new Builder();
        }

        public Builder fromEvent(Event anEvent) {
            if (isNull(anEvent)) getThis();
            withEventName(anEvent.getInfo().getDescriptor().getName());
            return getThis();
        }

        private Builder withEventName(Name aName) {
            return withEventName(aName.asText());
        }
    }

}
