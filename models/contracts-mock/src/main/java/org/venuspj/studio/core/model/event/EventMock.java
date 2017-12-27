package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.DescriptorMock;
import org.venuspj.studio.core.model.event.eventOutline.OutlineMock;
import org.venuspj.studio.core.model.event.flyers.FlyersMock;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.PerformersMock;

/**
 */
public class EventMock {

    public static Event createDummy(EventType anEventType) {
        return new Event(EventIdentifierMock.createDummy(anEventType.eventIdType()),
                anEventType.getEventInfo());
//                OutlineMock.createDummy(anEventType.outlineType()),
//                DescriptorMock.createDummy(anEventType.descriptorType()),
//                FlyersMock.createDummy(anEventType.flyersType()),
//                PerformersMock.createDummy(anEventType.performersType())
//        );
    }


    public enum EventType {
        EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_END_OF_LAST_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_END_OF_LAST_MONTH;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_END_OF_LAST_MONTH;
            }
        }, EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_START_OF_THIS_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_START_OF_THIS_MONTH;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_START_OF_THIS_MONTH;
            }
        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_THREE_DAYS_BEFORE;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_BEFORE;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_THREE_DAYS_BEFORE;
            }
        }, EVENT_ON_YESTERDAY {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_YESTERDAY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_YESTERDAY;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_YESTERDAY;
            }
        }, EVENT_ON_TODAY {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_TODAY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TODAY;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_TODAY;
            }
        }, EVENT_ON_TOMORROW {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_TOMORROW;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TOMORROW;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_TOMORROW;
            }
        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_THREE_DAYS_AFTER;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_AFTER;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_THREE_DAYS_AFTER;
            }
        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_END_OF_THIS_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_END_OF_THIS_MONTH;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_END_OF_THIS_MONTH;
            }
        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EVENT_ON_START_OF_NEXT_MONTH;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_START_OF_NEXT_MONTH;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_START_OF_NEXT_MONTH;
            }
        }, NOT_FOUND {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.NOT_FOUND;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_TODAY;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.NOT_FOUND;
            }
        }, EMPTY {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EMPTY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EMPTY;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EMPTY;
            }
        }, NOT_INSERTED_EVENT {
            @Override
            public EventIdentifierMock.MockType eventIdType() {
                return EventIdentifierMock.MockType.EMPTY;
            }

            @Override
            public OutlineMock.OutlineType outlineType() {
                return OutlineMock.OutlineType.EVENT_ON_START_OF_NEXT_WEEK;
            }

            @Override
            public EventInfoMock.EventInfoType getEventInfoType() {
                return EventInfoMock.EventInfoType.EVENT_ON_DAY_OF_NEXT_WEEK_SATADAY;
            }
        };

        public abstract EventIdentifierMock.MockType eventIdType();

        public abstract OutlineMock.OutlineType outlineType();

        public DescriptorMock.DescriptorType descriptorType() {
            return DescriptorMock.DescriptorType.DEFAULT;
        }

        public FlyersMock.FlyersType flyersType() {
            return FlyersMock.FlyersType.DEFAULT;
        }

        public PerformersMock.PerformersType performersType() {
            return PerformersMock.PerformersType.EMPTY;
        }

        public abstract EventInfoMock.EventInfoType getEventInfoType();

        public EventInfo getEventInfo() {
            return EventInfoMock.createDummy(getEventInfoType());

        }
    }
}
