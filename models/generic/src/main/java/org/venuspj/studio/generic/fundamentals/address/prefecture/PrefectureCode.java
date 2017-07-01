package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.venuspj.studio.core.fundamentals.IntegerIdValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class PrefectureCode implements IntegerIdValue {
    private Integer value;

    public PrefectureCode(Integer aValue) {
        value = aValue;
    }

    PrefectureCode() {

    }


    @Override
    public Integer asInteger() {
        return value;
    }

    @Override
    public String asText() {
        return value.toString();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
