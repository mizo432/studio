package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.model.momentInterval.momemt.event.flyers.FlyersMock;

/**
 */
public class EventMock {

    public static Event createDummy(EventType anEventType) {
        return new Event(EventIdMock.createDummy(anEventType.eventIdType()),
                OutlineMock.createDummy(anEventType.outlineType()),
                DescriptorMock.createDummy(anEventType.descriptorType()),
                FlyersMock.createDummy(anEventType.flyersType()));
    }


    public enum EventType {
        EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_END_OF_LAST_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_END_OF_LAST_MONTH;
            }
        }, EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_START_OF_THIS_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_START_OF_THIS_MONTH;
            }
        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_THREE_DAYS_BEFORE;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_BEFORE;
            }
        }, EVENT_ON_YESTERDAY {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_YESTERDAY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_YESTERDAY;
            }
        }, EVENT_ON_TODAY {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_TODAY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TODAY;
            }
        }, EVENT_ON_TOMORROW {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_TOMORROW;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TOMORROW;
            }
        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_THREE_DAYS_AFTER;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_AFTER;
            }
        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_END_OF_THIS_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_END_OF_THIS_MONTH;
            }
        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.EVENT_ON_START_OF_NEXT_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_START_OF_NEXT_MONTH;
            }
        }, NOT_FOUND {
            @Override
            public EventIdMock.EventIDType eventIdType() {
                return EventIdMock.EventIDType.NOT_FOUND;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TODAY;
            }
        };

        public abstract EventIdMock.EventIDType eventIdType();

        public abstract OutlineMock.OutlineType outlineType();

        public DescriptorMock.DescriptorType descriptorType() {
            return DescriptorMock.DescriptorType.DEFAULT;
        }

        public FlyersMock.FlyersType flyersType() {
            return FlyersMock.FlyersType.DEFAULT;
        }
    }
}
