package org.venuspj.studio.core.model.event.flyers;

import org.venuspj.studio.core.model.event.EventId;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class EventIdMock {

    public static EventId createDummy(EventIDType anEventIDType) {
        return new EventId(anEventIDType.eventIdValue());
    }

    public enum EventIDType {
        EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public Integer eventIdValue() {
                return 1;
            }
        }, EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public Integer eventIdValue() {
                return 2;
            }
        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public Integer eventIdValue() {
                return 3;
            }
        }, EVENT_ON_YESTERDAY {
            @Override
            public Integer eventIdValue() {
                return 4;
            }
        }, EVENT_ON_TODAY {
            @Override
            public Integer eventIdValue() {
                return 5;
            }
        }, EVENT_ON_TOMORROW {
            @Override
            public Integer eventIdValue() {
                return 6;
            }
        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public Integer eventIdValue() {
                return 7;
            }
        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public Integer eventIdValue() {
                return 8;
            }
        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public Integer eventIdValue() {
                return 9;
            }
        }, DEFAULT {
            @Override
            public Integer eventIdValue() {
                return 5;
            }
        }, NOT_FOUND {
            @Override
            public Integer eventIdValue() {
                return 10000;
            }
        };

        public abstract Integer eventIdValue();
    }

}
