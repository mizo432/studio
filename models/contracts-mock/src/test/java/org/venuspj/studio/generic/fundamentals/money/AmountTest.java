package org.venuspj.studio.generic.fundamentals.money;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class AmountTest {

    @Test
    public void zero() throws Exception {
        Amount target = Amount.zero();
        String actual = toStringHelper(target).defaultConfig().toString();
        assertThat(actual)
                .isNotNull();
//                .isEqualTo("Amount{0}");
        System.out.println(actual);
    }

    @Test
    public void empty() throws Exception {
        Amount target = Amount.empty();
        String actual = toStringHelper(target).defaultConfig().toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Amount{}");
        System.out.println(actual);
    }

    @Test
    public void isEmpty01() throws Exception {
        Amount target = Amount.empty();
        boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isEmpty02() throws Exception {
        Amount target = Amount.zero();
        boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }

    @Test
    public void isEmpty03() throws Exception {
        Amount target = new Amount(500);
        boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println("actual:" + actual);
    }

}