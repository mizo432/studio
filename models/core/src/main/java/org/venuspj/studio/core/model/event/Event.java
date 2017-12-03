package org.venuspj.studio.core.model.event;

import org.venuspj.ddd.model.entity.AbstractEntity;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.util.builder.ObjectBuilder;

import static org.venuspj.util.objects2.Objects2.*;

/**
 * イベント
 */
public class Event extends AbstractEntity<Event> {
    EventInfo eventInfo = EventInfo.emptyEventInfo();

    public Event(EventIdentifier anIdentifier, EventInfo anEventInfo) {
        super(anIdentifier);
        eventInfo = anEventInfo;
    }

    private Event() {

    }

    public static Event emptyEvent() {
        return new Event(
                EventIdentifier.empty(),
                EventInfo.emptyEventInfo()
        );
    }

    public Outline outline() {
        return eventInfo.getOutLine();
    }

    public EventInfo getInfo() {
        return eventInfo;
    }

    public EventIdentifier getEventIdentifier() {
        return (EventIdentifier) identifier();
    }

    public static final class EventBuilder extends ObjectBuilder<Event, EventBuilder> {
        private EventIdentifier identifier;
        private EventInfo eventInfo;

        @Override
        protected void apply(Event vo, EventBuilder builder) {
            builder.withIdentifier((EventIdentifier) vo.identifier());
            builder.withEventInfo(vo.getInfo());
        }

        public EventBuilder withEventInfo(EventInfo anEventInfo) {
            if (isNull(anEventInfo)) return getThis();
            addConfigurator(builder -> builder.eventInfo = anEventInfo);
            return getThis();
        }

        public EventBuilder withIdentifier(EventIdentifier anIdentifier) {
            if (isNull(anIdentifier)) return getThis();
            addConfigurator(builder -> builder.identifier = anIdentifier);
            return getThis();

        }

        @Override
        protected Event createValueObject() {
            return new Event(identifier, eventInfo);
        }

        @Override
        protected EventBuilder getThis() {
            return this;
        }

        @Override
        protected EventBuilder newInstance() {
            return new EventBuilder();
        }
    }

}
