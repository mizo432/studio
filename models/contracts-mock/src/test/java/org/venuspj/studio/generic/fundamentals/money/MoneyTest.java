package org.venuspj.studio.generic.fundamentals.money;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.*;
import static org.venuspj.util.objects2.Objects2.toStringHelper;

/**
 */
public class MoneyTest {

    @Test
    public void zero() throws Exception {
        Money target = Money.zero();
        String actual = toStringHelper(target).defaultConfig().toString();
        System.out.println(actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void asDisplayText() throws Exception {
        Money target = Money.zero();
        String actual = target.asDisplayText();
        System.out.println(actual);
        assertThat(actual)
                .isNotNull();
    }

    @Test
    public void empty() throws Exception {
        Money target = Money.empty();
        String actual = toStringHelper(target).defaultConfig().toString();
        System.out.println(actual);
        assertThat(actual)
                .isNotNull();
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