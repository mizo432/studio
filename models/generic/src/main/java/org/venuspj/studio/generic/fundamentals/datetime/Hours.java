package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.util.objects2.Objects2;

/**
 * 時間数
 */
public class Hours {
    protected Integer value;

    Hours() {

    }

    public Hours(Integer aValue) {
        value = aValue;

    }

    public static Hours zero() {
        return new Hours(0);
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
