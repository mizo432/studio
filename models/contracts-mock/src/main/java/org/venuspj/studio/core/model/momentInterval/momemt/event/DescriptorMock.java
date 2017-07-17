package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.core.fundamentals.descriptor.Descriptor;
import org.venuspj.studio.generic.fundamentals.name.NameMock;

/**
 */
public class DescriptorMock {
    public static Descriptor createDummy(DescriptorType anDescriptorType) {
        return new Descriptor(NameMock.createDummy(anDescriptorType.nameType()),
                DescriptionMock.createDummy(anDescriptorType.descriptionType()));
    }

    public enum DescriptorType {
        EVENT_DESCRIPTOR_ON_END_OF_LAST_MONTH {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_END_OF_LAST_MONTH;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_END_OF_LAST_MONTH;
            }
        }, EVENT_DESCRIPTOR_ON_START_OF_THIS_MONTH {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_START_OF_THIS_MONTH;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_START_OF_THIS_MONTH;
            }
        }, EVENT_DESCRIPTOR_ON_THREE_DAYS_BEFORE {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_THREE_DAYS_BEFORE;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_ON_THREE_DAYS_BEFORE;
            }
        }, EVENT_DESCRIPTOR_ON_YESTERDAY {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_YESTERDAY;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_YESTERDAY;
            }
        },
        EVENT_DESCRIPTOR_ON_TODAY {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_TODAY;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_TODAY;
            }
        },
        EVENT_DESCRIPTOR_ON_TOMORROW {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_TOMORROW;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_TOMORROW;
            }
        }, EVENT_DESCRIPTOR_ON_THREE_DAYS_AFTER {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_THREE_DAYS_AFTER;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_THREE_DAYS_AFTER;
            }
        }, EVENT_DESCRIPTOR_ON_END_OF_THIS_MONTH {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_END_OF_THIS_MONTH;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_END_OF_THIS_MONTH;
            }
        },
        EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.EVENT_DESCRIPTION_ON_START_OF_NEXT_MONTH;
            }
        }, DEFAULT {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.DEFAULT_EVENT_DESCRIPTOR;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.DEFAULT;
            }
        }, STUDIO_DESCRIPTOR {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.STUDIO_NAME;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.STUDIO;
            }
        }, ALBUM1 {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.ALUBUM_NAME1;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.ALBUM1;
            }
        }, ALBUM2 {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.ALUBUM_NAME2;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.ALBUM2;
            }
        }, ALBUM3 {
            @Override
            public NameMock.NameType nameType() {
                return NameMock.NameType.ALUBUM_NAME3;
            }

            @Override
            public DescriptionMock.DescriptionType descriptionType() {
                return DescriptionMock.DescriptionType.ALBUM3;
            }
        };


        public abstract NameMock.NameType nameType();

        public abstract DescriptionMock.DescriptionType descriptionType();
    }

}
