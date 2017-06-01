package jp.or.venuspj.studo.generic.fundamentals.datetime;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by kenichimizoguchi on 2017/06/01.
 */
public class RecordDateTest {

    @Test
    public void isPresent01() {
        RecordDate target = new RecordDate();
        assertThat(target.isPresent())
                .isFalse();
    }

    @Test
    public void isPresent02() {
        RecordDate target = RecordDateTest.createDummyData(TestDateKind.BASE_DATE);
        assertThat(target.isPresent())
                .isTrue();
    }

    public static RecordDate createDummyData(TestDateKind aTestDateKind) {
        return new RecordDate(aTestDateKind.date());
    }

    public enum TestDateKind {
        BASE_DATE {
            @Override
            public LocalDate date() {
                return LocalDate.of(2016, 2, 3);
            }
        }, PAST_DATE {
            @Override
            public LocalDate date() {
                return LocalDate.of(2016, 1, 3);
            }
        };

        public abstract LocalDate date();
    }

}