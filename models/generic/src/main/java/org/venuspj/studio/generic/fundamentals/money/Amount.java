package org.venuspj.studio.generic.fundamentals.money;

import org.venuspj.util.objects2.Objects2;

/**
 * 金額.
 */
public class Amount {
    Integer value;

    Amount() {

    }

    public Amount(Integer aValue) {
        value = aValue;
    }

    public static Amount zero() {
        return new Amount(0);
    }

    public static Amount empty() {
        return new Amount();
    }

    boolean isEmpty() {
        return Objects2.isNull(value);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
