package org.venuspj.studio.generic.fundamentals.datetime;

import java.time.LocalDate;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class RecordDateMock {
    public static RecordDate createDummy(RecordDateType aRecordDateType) {
        return new RecordDate(aRecordDateType.currentDate());
    }

    public enum RecordDateType {
        END_OF_LAST_MONTH {
            @Override
            public LocalDate currentDate() {
                LocalDate date = TODAY.currentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), 1).minusDays(1);
            }
        },
        START_OF_THIS_MONTH {
            @Override
            public LocalDate currentDate() {
                LocalDate date = TODAY.currentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), 1);
            }
        },
        THREE_DAYS_BEFORE {
            @Override
            public LocalDate currentDate() {
                return TODAY.currentDate().minusDays(3);
            }
        },
        YESTERDAY {
            @Override
            public LocalDate currentDate() {
                return TODAY.currentDate().minusDays(1);
            }
        },
        TODAY {
            @Override
            public LocalDate currentDate() {
                return LocalDate.of(2017, 8, 15);
            }
        },
        TOMORROW {
            @Override
            public LocalDate currentDate() {
                return TODAY.currentDate().plusDays(1);
            }
        },
        THREE_DAYS_AFTER {
            @Override
            public LocalDate currentDate() {
                return TODAY.currentDate().plusDays(3);
            }
        },
        END_OF_THIS_MONTH {
            @Override
            public LocalDate currentDate() {
                LocalDate date = TODAY.currentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
            }
        },
        START_OF_NEXT_MONTH {
            @Override
            public LocalDate currentDate() {
                return END_OF_THIS_MONTH.currentDate().plusDays(1);
            }
        },
        DEFAULT {
            @Override
            public LocalDate currentDate() {
                return LocalDate.of(2017, 8, 15);
            }
        }, START_OF_NEXT_WEEK {
            @Override
            public LocalDate currentDate() {
                return TODAY.currentDate().plusDays(7);
            }
        };

        public abstract LocalDate currentDate();
    }
}
