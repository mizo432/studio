package org.venuspj.studio.generic.fundamentals.money;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class AmountTest {
    @Test
    public void zero() throws Exception {
        Amount target = Amount.zero();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Amount{0}");
        System.out.println(actual);
    }

    @Test
    public void empty() throws Exception {
        Amount target = Amount.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Amount{null}");
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

    @Test
    public void toString01() throws Exception {
        Amount target = new Amount(500);
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Amount{500}");
        System.out.println("actual:" + actual);
    }


}