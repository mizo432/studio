package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.util.objects2.Objects2;

public class Days {
    protected Integer value;

    Days() {

    }

    public Days(Integer aValue) {
        value = aValue;

    }

    public static Days zero() {
        return new Days(0);
    }

    public Integer asInteger() {
        return value;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
