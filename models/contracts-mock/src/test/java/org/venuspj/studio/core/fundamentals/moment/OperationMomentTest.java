package org.venuspj.studio.core.fundamentals.moment;

import org.junit.Test;
import org.venuspj.studio.core.model.role.partyRole.operator.OperatorId;
import org.venuspj.studio.core.model.role.partyRole.operator.OperatorIdMock;
import org.venuspj.studio.generic.fundamentals.datetime.RecordDatetime;

import static org.assertj.core.api.Java6Assertions.*;

public class OperationMomentTest {


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
        OperationMoment target = new OperationMoment(RecordDatetime.now(), OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        System.out.println("actual:" + actual);
    }

    @Test
    public void isPrecent03() {
        OperationMoment target = new OperationMoment(new RecordDatetime(), OperatorId.EMPTY);
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isFalse();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isPrecent04() {
        OperationMoment target = new OperationMoment(
                RecordDatetime.now(), OperatorIdMock.createDummy());
        boolean actual = target.isPrecent();
        assertThat(actual)
                .isTrue();

        System.out.println("actual:" + actual);
    }

}
