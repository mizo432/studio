package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.model.event.Event;
import org.venuspj.studio.core.model.event.Events;
import org.venuspj.util.collect.Lists2;

import java.util.List;

/**
 */
public final class EventsMock {

    public static Events createDummy(EventsType anEventsType) {
        List<Event> eventList = Lists2.newArrayListWithExpectedSize(anEventsType.eventCount());
        for (EventMock.EventType eventType : anEventsType.eventTypes()) {
            eventList.add(EventMock.createDummy(eventType));
        }
        return new Events(eventList);
    }

    public enum EventsType {
        DEFAULT {
            @Override
            public EventMock.EventType[] eventTypes() {
                return new EventMock.EventType[]{
                        EventMock.EventType.EVENT_ON_END_OF_LAST_MONTH,
                        EventMock.EventType.EVENT_ON_START_OF_THIS_MONTH,
                        EventMock.EventType.EVENT_ON_YESTERDAY,
                        EventMock.EventType.EVENT_ON_TODAY,
                        EventMock.EventType.EVENT_ON_THREE_DAYS_AFTER,
                        EventMock.EventType.EVENT_ON_END_OF_THIS_MONTH,
                        EventMock.EventType.EVENT_ON_START_OF_NEXT_MONTH
                };
            }
        };

        public Integer eventCount() {
            EventMock.EventType[] eventTypes = eventTypes();
            return eventTypes.length;
        }

        public abstract EventMock.EventType[] eventTypes();
    }

}
