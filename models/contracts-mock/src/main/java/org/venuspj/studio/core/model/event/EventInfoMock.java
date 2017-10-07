package org.venuspj.studio.core.model.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorMock;
import org.venuspj.studio.core.model.event.eventOutline.Outline;
import org.venuspj.studio.core.model.event.eventOutline.OutlineMock;
import org.venuspj.studio.core.model.event.flyers.Flyers;
import org.venuspj.studio.core.model.role.partyRole.organizationRole.performer.Performers;

public class EventInfoMock {
    public static EventInfo createDummy(EventInfoType anEventInfoType) {
        return anEventInfoType.getEventInfo();
    }

    public enum EventInfoType {
        EMPTY {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        Outline.emptyOutline(),
                        Descriptor.emptyDescriptor(),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_END_OF_LAST_MONTH {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_END_OF_LAST_MONTH),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_END_OF_LAST_MONTH),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_START_OF_THIS_MONTH {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_START_OF_THIS_MONTH),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_THREE_DAYS_BEFORE {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_BEFORE),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_THREE_DAYS_BEFORE),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_YESTERDAY {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_YESTERDAY),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_YESTERDAY),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_TODAY {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_TODAY),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_TODAY),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_TOMORROW {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_TOMORROW),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_TOMORROW),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_THREE_DAYS_AFTER {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_THREE_DAYS_AFTER),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_THREE_DAYS_AFTER),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_END_OF_THIS_MONTH {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_END_OF_THIS_MONTH),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_END_OF_THIS_MONTH),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, EVENT_ON_START_OF_NEXT_MONTH {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EVENT_ON_START_OF_NEXT_MONTH),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        }, NOT_FOUND {
            @Override
            public EventInfo getEventInfo() {
                return new EventInfo(
                        OutlineMock.createDummy(OutlineMock.OutlineType.EMPTY),
                        DescriptorMock.createDummy(DescriptorMock.DescriptorType.EVENT_EMPTY),
                        Flyers.emptyFlyers(),
                        Performers.emptyPerformers());
            }

        };

        public EventInfo getEventInfo() {
            return new EventInfo(
                    Outline.emptyOutline(),
                    Descriptor.emptyDescriptor(),
                    Flyers.emptyFlyers(),
                    Performers.emptyPerformers());
        }
    }
}
