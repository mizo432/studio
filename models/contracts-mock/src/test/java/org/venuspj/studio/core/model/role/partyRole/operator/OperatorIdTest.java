package org.venuspj.studio.core.model.role.partyRole.operator;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class OperatorIdTest {

    @Test
    public void toString01() throws Exception {
        OperatorId target = new OperatorId();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void toString02() throws Exception {
        OperatorId target = OperatorIdMock.createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void isPresent1() throws Exception {
        OperatorId target = new OperatorId();
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

    @Test
    public void isPresent2() throws Exception {
        OperatorId target = OperatorId.EMPTY;
        assertThat(target)
                .isNotNull();
        assertThat(target.isPresent())
                .isNotNull()
                .isEqualTo(false);
    }

}
