package org.venuspj.studio.view.event;

import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

public class EventViewModel {

    private String eventName;

    EventViewModel(String anEventName) {

    }

    EventViewModel() {

    }

    public static EventViewModel create() {
        return new EventViewModel();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String aValue) {
        eventName = aValue;
    }

    public static class Builder extends ObjectBuilder<EventViewModel, Builder> {
        private String eventName;

        @Override
        protected void apply(EventViewModel vo, Builder builder) {
            builder.withEventName(vo.getEventName());

        }

        public Builder withEventName(String anEventName) {
            if (isNull(anEventName)) return getThis();
            addConfigurator(builder -> builder.eventName = anEventName);
            return getThis();
        }

        @Override
        protected EventViewModel createValueObject() {
            return new EventViewModel(eventName);
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
