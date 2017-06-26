package org.venuspj.studio.core.fundamentals.moment;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.venuspj.studio.core.fundamentals.descriptor.DescriptorTest;
import org.venuspj.studio.core.model.operator.OperatorId;
import org.venuspj.studo.generic.fundamentals.datetime.RecordDatetime;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

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

    public static OperationMoment createDummy() {
        StaticDateProvider.initialize(LocalDateTime.of(2017,6,27,1,2,3,4));
      return new  OperationMoment(RecordDatetime.now(), OperatorId.EMPTY);
    }

}
