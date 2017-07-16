package org.venuspj.studio.core.model.momentInterval.momemt.event;

import org.venuspj.studio.generic.fundamentals.datetime.RecordDate;

import java.time.LocalDate;

/**
 * Created by mizoguchi on 2017/07/16.
 */
public class RecordDateMock {
    public static RecordDate createDummy(RecordDateType aRecordDateType) {
        return new RecordDate(aRecordDateType.ccurentDate());
    }

    public enum RecordDateType {
        END_OF_LAST_MONTH {
            @Override
            public LocalDate ccurentDate() {
                LocalDate date = TODAY.ccurentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), 1).minusDays(1);
            }
        },
        START_OF_THIS_MONTH {
            @Override
            public LocalDate ccurentDate() {
                LocalDate date = TODAY.ccurentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), 1);
            }
        },
        THREE_DAYS_BEFORE {
            @Override
            public LocalDate ccurentDate() {
                return TODAY.ccurentDate().minusDays(3);
            }
        },
        YESTERDAY {
            @Override
            public LocalDate ccurentDate() {
                return TODAY.ccurentDate().minusDays(1);
            }
        },
        TODAY {
            @Override
            public LocalDate ccurentDate() {
                return LocalDate.of(2017, 8, 15);
            }
        },
        TOMORROW {
            @Override
            public LocalDate ccurentDate() {
                return TODAY.ccurentDate().plusDays(1);
            }
        },
        THREE_DAYS_AFTER {
            @Override
            public LocalDate ccurentDate() {
                return TODAY.ccurentDate().plusDays(3);
            }
        },
        END_OF_THIS_MONTH {
            @Override
            public LocalDate ccurentDate() {
                LocalDate date = TODAY.ccurentDate();
                return LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
            }
        },
        START_OF_NEXT_MONTH {
            @Override
            public LocalDate ccurentDate() {
                return END_OF_THIS_MONTH.ccurentDate().plusDays(1);
            }
        },
        DEFAULT {
            @Override
            public LocalDate ccurentDate() {
                return LocalDate.of(2017, 8, 15);
            }
        };

        public abstract LocalDate ccurentDate();
    }
}
