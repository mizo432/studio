package org.venuspj.studo.generic.fundamentals.datetime;

import java.time.LocalDateTime;

/**
 */
public class RecordDatetimeTest {

    public static RecordDatetime createDummyData(TestDateKind aTestDateKind) {
        return new RecordDatetime(aTestDateKind.dateTime());
    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public LocalDateTime dateTime() {
                return LocalDateTime.of(2016, 2, 3, 4, 5, 6, 7);
            }
        }, PAST_DATE {
            @Override
            public LocalDateTime dateTime() {
                return LocalDateTime.of(2016, 1, 3, 4, 5, 6, 7);
            }
        };

        public abstract LocalDateTime dateTime();
    }
}