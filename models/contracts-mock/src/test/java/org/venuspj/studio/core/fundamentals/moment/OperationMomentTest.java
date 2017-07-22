package org.venuspj.studio.core.fundamentals.moment;

import org.junit.Test;
import org.venuspj.studio.core.model.role.partyRole.operator.OperatorId;
import org.venuspj.studio.core.model.role.partyRole.operator.OperatorIdMock;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDateTime;
import org.venuspj.util.dateProvider.StaticDateTimeProvider;

import java.time.LocalDateTime;

import static org.assertj.core.api.Java6Assertions.*;

public class OperationMomentTest {


    public static OperationMoment createDummy() {
        StaticDateTimeProvider.initialize(LocalDateTime.of(2017, 6, 27, 1, 2, 3, 4));
        return new OperationMoment(RecordDateTime.now(), OperatorId.EMPTY);
    }

    @Test
    public void testToString01() {
        OperationMoment target = new OperationMoment();
        System.out.println("target:" + target);
    }

    @Test
    public void testToString02() {
        OperationMoment target = OperationMomentMock.createDummy();
        System.out.println("target:" + target);
    }

    @Test
    public void isPrecent01() {
        OperationMoment target = new OperationMoment();
        boolean actual = target.isPrecent();
        System.out.println("target:" + target);
        assertThat(actual)
                .isFalse();
    }

    @Test
    public void isPrecent02() {
        OperationMoment target = new OperationMoment(RecordDateTime.now(), OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        System.out.println("actual:" + actual);
    }

    @Test
    public void isPrecent03() {
        OperationMoment target = new OperationMoment(new RecordDateTime(), OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isFalse();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isPrecent04() {
        OperationMoment target = new OperationMoment(
                RecordDateTime.now(), OperatorIdMock.createDummy());
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        System.out.println("actual:" + actual);
    }

}
