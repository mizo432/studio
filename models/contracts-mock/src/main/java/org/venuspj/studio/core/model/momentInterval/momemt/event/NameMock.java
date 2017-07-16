package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.name.Name;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public final class NameMock {
    public static Name createDummy(NameType aNameType) {
        return new Name(aNameType.namePrefix() + "_NAME_" + aNameType.index());
    }

    public enum NameType {
        EVENT_DESCRIPTOR_ON_END_OF_LAST_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 1;
            }
        }, EVENT_DESCRIPTOR_ON_START_OF_THIS_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 2;
            }
        }, EVENT_DESCRIPTOR_ON_YESTERDAY {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 3;
            }
        },
        EVENT_DESCRIPTOR_ON_TODAY {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 4;
            }
        }, EVENT_DESCRIPTOR_ON_THREE_DAYS_AFTER {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 5;
            }
        }, EVENT_DESCRIPTOR_ON_END_OF_THIS_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 6;
            }
        },
        EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 7;
            }
        }, DEFAULT {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 4;
            }
        };

        public abstract String namePrefix();

        public abstract int index();
    }

}
