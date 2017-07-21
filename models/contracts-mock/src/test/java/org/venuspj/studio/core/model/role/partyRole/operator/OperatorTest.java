package org.venuspj.studio.core.model.role.partyRole.operator;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

public class OperatorTest {

    @Test
    public void toString01() throws Exception {
        Operator target = new Operator();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

    @Test
    public void toString02() throws Exception {
        Operator target = OperatorMock.createDummy();
        assertThat(target)
                .isNotNull();
        assertThat(target.toString())
                .isNotNull();
        System.out.println("actual:" + target.toString());
    }

}
