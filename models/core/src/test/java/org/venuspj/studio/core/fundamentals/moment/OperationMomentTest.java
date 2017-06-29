package org.venuspj.studio.core.fundamentals.moment;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.model.operator.OperatorId;
import org.venuspj.studio.core.model.operator.OperatorIdTest;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDatetime;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class OperationMomentTest {
    private static Logger LOGGER = LoggerFactory.getLogger(DescriptorTest.class);

    @Test
    public void testToString01() {
        OperationMoment target = new OperationMoment();
        LOGGER.debug("actual:" + target);
    }

    @Test
    public void testToString02() {
        OperationMoment target = createDummy();
        LOGGER.debug("actual:" + target);
    }

    @Test
    public void isPrecent01() {
        OperationMoment target = new OperationMoment();
        boolean actual = target.isPrecent();
        LOGGER.debug("actual:" + actual);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void isPrecent02() {
        OperationMoment target = new OperationMoment(RecordDatetime.now(),OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        LOGGER.debug("actual:" + actual);
    }
    @Test
    public void isPrecent03() {
        OperationMoment target = new OperationMoment(new RecordDatetime(),OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isFalse();

        LOGGER.debug("actual:" + actual);
    }

    @Test
    public void isPrecent04() {
        OperationMoment target = new OperationMoment(
                RecordDatetime.now(), OperatorIdTest.createDummy());
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        LOGGER.debug("actual:" + actual);
    }

    public static OperationMoment createDummy() {
        StaticDateProvider.initialize(LocalDateTime.of(2017,6,27,1,2,3,4));
      return new  OperationMoment(RecordDatetime.now(), OperatorId.EMPTY);
    }

}
