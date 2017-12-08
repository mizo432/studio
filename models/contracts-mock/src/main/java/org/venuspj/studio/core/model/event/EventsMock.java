package org.venuspj.studio.core.model.event;

import org.venuspj.util.collect.Lists2;

import java.util.List;

/**
 */
public final class EventsMock {

    public static Events createDummy(MockType anMockType) {
        List<Event> eventList = Lists2.newArrayListWithCapacity(anMockType.eventCount());
        for (EventMock.EventType eventType : anMockType.eventTypes()) {
            eventList.add(EventMock.createDummy(eventType));
        }
        return new Events(eventList);
    }

    public enum MockType {
        DEFAULT {
            @Override
            public EventMock.EventType[] eventTypes() {
                return new EventMock.EventType[]{
                        EventMock.EventType.EVENT_ON_END_OF_LAST_MONTH,
                        EventMock.EventType.EVENT_ON_START_OF_THIS_MONTH,
                        EventMock.EventType.EVENT_ON_THREE_DAYS_BEFORE,
                        EventMock.EventType.EVENT_ON_YESTERDAY,
                        EventMock.EventType.EVENT_ON_TODAY,
                        EventMock.EventType.EVENT_ON_TOMORROW,
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
