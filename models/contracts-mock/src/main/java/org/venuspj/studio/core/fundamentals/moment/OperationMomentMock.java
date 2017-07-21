package org.venuspj.studio.core.fundamentals.moment;

import org.venuspj.studio.core.model.role.partyRole.operator.OperatorId;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDatetime;
import org.venuspj.util.dateProvider.StaticDateProvider;

import java.time.LocalDateTime;

/**
 */
public class OperationMomentMock {

    public static OperationMoment createDummy() {
        StaticDateProvider.initialize(LocalDateTime.of(2017, 6, 27, 1, 2, 3, 4));
        return new OperationMoment(RecordDatetime.now(), OperatorId.EMPTY);
    }

}
