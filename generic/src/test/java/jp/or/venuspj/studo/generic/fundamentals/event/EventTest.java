package jp.or.venuspj.studo.generic.fundamentals.event;

import jp.or.venuspj.studo.authentication.model.UserId;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDateTime;
import jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDateTimeTest;
import jp.or.venuspj.studo.generic.fundamentals.moment.Moment;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import java.time.LocalDateTime;

import static jp.or.venuspj.studo.generic.fundamentals.datetime.RecordDateTimeTest.TestDateKind.*;
import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by mizoguchi on 2017/03/25.
 */
@RunWith(Enclosed.class)
public class EventTest {

    public static class SameValueAsTest {


        /**
         * 一致している場合の確認.
         *
         * @throws Exception
         */
        @Test
        public void test01() throws Exception {
            Event target = createDummyData(BASE_DATE);
            assertThat(target.sameValueAs(target)).isTrue();
        }


        /**
         * 一致していない場合の確認.
         *
         * @throws Exception
         */
        @Test
        public void test02() throws Exception {
            Event target = createDummyData(BASE_DATE);
            assertThat(target.sameValueAs(createDummyData(PAST_DATE))).isFalse();
        }

    }

    public static Event createDummyData(RecordDateTimeTest.TestDateKind aTestDateKind) {
        return new EventBuilder()
                .withMoment(new Moment(RecordDateTimeTest.createDummyData(aTestDateKind)))
                .withUserId(new UserId(10))
                .build();
    }
}