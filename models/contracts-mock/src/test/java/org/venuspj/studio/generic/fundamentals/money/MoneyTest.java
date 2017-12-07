package org.venuspj.studio.generic.fundamentals.money;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;

/**
 */
public class MoneyTest {
    @Test
    public void zero() throws Exception {
        Money target = Money.zero();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Money{amount=Amount{0}, currency=JPY}");
        System.out.println(actual);
    }

    @Test
    public void empty() throws Exception {
        Money target = Money.empty();
        String actual = target.toString();
        assertThat(actual)
                .isNotNull()
                .isEqualTo("Money{amount=Amount{null}, currency=JPY}");
        System.out.println(actual);
    }

    @Test
    public void isEmpty01() throws Exception {
        Money target = Money.zero();
        Boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println(actual);
    }

    @Test
    public void isEmpty02() throws Exception {
        Money target = Money.empty();
        Boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isTrue();
        System.out.println(actual);
    }

    @Test
    public void isEmpty03() throws Exception {
        Money target = new Money(new Amount(500));
        Boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println(actual);
    }

    @Test
    public void isEmpty04() throws Exception {
        Money target = new Money(500);
        Boolean actual = target.isEmpty();
        assertThat(actual)
                .isNotNull()
                .isFalse();
        System.out.println(actual);
    }

}