package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;

/**
 */
public class DescriptorMock {
    public static Descriptor createDummy(DescriptorType anDescriptorType) {
        return new Descriptor(NameMock.createDummy(anDescriptorType.nameType()),
                DescriptionMock.createDummy(anDescriptorType.descriptionType()));
    }

    public enum DescriptorType {
        EVENT_DESCRIPTER_ON_END_OF_LAST_MONTH, EVENT_DESCRIPTER_ON_START_OF_THIS_MONTH, EVENT_DESCRIPTER_ON_YESTERDAY,
        EVENT_DESCRIPTER_ON_TODAY, EVENT_DESCRIPTER_ON_THREE_DAYS_AFTER, EVENT_DESCRIPTER_ON_END_OF_THIS_MONTH,
        EVENT_DESCRIPTER_ON_START_OF_NEXT_MONTH, DEFAULT;


        public NameMock.NameType nameType() {
            return NameMock.NameType.DEFAULT;
        }

        public DescriptionMock.DescriptionType descriptionType() {
            return DescriptionMock.DescriptionType.DEFAULT;
        }
    }

}
