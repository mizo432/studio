package org.venuspj.studio.generic.fundamentals.name;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public final class NameMock {
    public static Name createDummy(NameType aNameType) {
        return new Name(aNameType.namePrefix() + "_NAME_" + aNameType.index());
    }

    public enum NameType {
        DEFAULT {
            @Override
            public String namePrefix() {
                return "DEFAULT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 0;
            }
        }, EVENT_DESCRIPTOR_ON_END_OF_LAST_MONTH {
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
        }, EVENT_DESCRIPTOR_ON_THREE_DAYS_BEFORE {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 3;
            }
        }, EVENT_DESCRIPTOR_ON_YESTERDAY {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 4;
            }
        },
        EVENT_DESCRIPTOR_ON_TODAY {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 5;
            }
        }, EVENT_DESCRIPTOR_ON_TOMORROW {
            @Override
            public String namePrefix() {
                return name();
            }

            @Override
            public int index() {
                return 6;
            }
        }, EVENT_DESCRIPTOR_ON_THREE_DAYS_AFTER {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 7;
            }
        }, EVENT_DESCRIPTOR_ON_END_OF_THIS_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 8;
            }
        },
        EVENT_DESCRIPTOR_ON_START_OF_NEXT_MONTH {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 9;
            }
        }, DEFAULT_EVENT_DESCRIPTOR {
            @Override
            public String namePrefix() {
                return "EVENT_DESCRIPTOR";
            }

            @Override
            public int index() {
                return 5;
            }
        }, PLAYER1 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 1;
            }
        }, PLAYER2 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 2;
            }
        }, PLAYER3 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 3;
            }
        }, PLAYER4 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 4;
            }
        }, STUDIO_NAME {
            @Override
            public String namePrefix() {
                return name();
            }

            @Override
            public int index() {
                return 1;
            }
        }, ALUBUM_NAME1 {
            @Override
            public String namePrefix() {
                return "ALBUM_NAME";
            }

            @Override
            public int index() {
                return 1;
            }
        }, ALUBUM_NAME2 {
            @Override
            public String namePrefix() {
                return "ALBUM_NAME";
            }

            @Override
            public int index() {
                return 2;
            }
        }, ALUBUM_NAME3 {
            @Override
            public String namePrefix() {
                return "ALBUM_NAME";
            }

            @Override
            public int index() {
                return 3;
            }
        }, TENUGUI_NAME1 {
            @Override
            public String namePrefix() {
                return "TENUGUI_NAME";
            }

            @Override
            public int index() {
                return 1;
            }
        }, PLAYER6 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 5;
            }
        }, PLAYER5 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 6;
            }
        }, EMPTY {
            @Override
            public String namePrefix() {
                return "EMPTY";
            }

            @Override
            public int index() {
                return 0;
            }
        }, ANY_EVENT {
            @Override
            public String namePrefix() {
                return "ANY_EVENT";
            }

            @Override
            public int index() {
                return 0;
            }
        }, PLAYER7 {
            @Override
            public String namePrefix() {
                return "PLAYER";
            }

            @Override
            public int index() {
                return 7;
            }
        };

        public abstract String namePrefix();

        public abstract int index();
    }

}
