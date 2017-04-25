package jp.or.venuspj.studo.generic.fundamentals.datetime;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * Created by mizoguchi on 2017/03/25.
 */
public class RecordDateTimeTest {

    public static RecordDateTime createDummyData(TestDateKind aTestDateKind) {
        return new RecordDateTime(aTestDateKind.dateTime());
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