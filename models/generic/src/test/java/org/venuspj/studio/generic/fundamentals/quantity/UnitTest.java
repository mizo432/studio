package org.venuspj.studio.generic.fundamentals.quantity;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class UnitTest {

    @Test
    public void unknown() throws Exception {
        Unit target = Unit.unknown();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull();
        System.out.println("actual:" + actual);
    }

    @Test
    public void ToString01() throws Exception {
        Unit target = new Unit("式");
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Unit{式}");
        System.out.println("actual:" + actual);
    }

}