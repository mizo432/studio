package org.venuspj.studio.core.model.momentInterval.momemt.event;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class EventIdMock {

    public static EventId createDummy(EventIDType anEventIDType) {
        return new EventId(anEventIDType.eventIdValue());
    }

    public enum EventIDType {
        EVENT_ON_END_OF_LAST_MONTH, EVENT_ON_START_OF_THIS_MONTH, EVENT_ON_YESTERDAY, EVENT_ON_TODAY, EVENT_ON_THREE_DAYS_AFTER, EVENT_ON_END_OF_THIS_MONTH, EVENT_ON_START_OF_NEXT_MONTH, DEFAULT;

        public Integer eventIdValue() {
            return 1;
        }
    }

}
