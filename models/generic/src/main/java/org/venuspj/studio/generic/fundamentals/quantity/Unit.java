package org.venuspj.studio.generic.fundamentals.quantity;

import org.venuspj.util.objects2.Objects2;

/**
 * 単位
 */
public class Unit {
    private String value;

    public Unit(String aValue) {
        value = aValue;
    }

    public Unit() {

    }

    public static Unit unknown() {
        return new Unit();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
