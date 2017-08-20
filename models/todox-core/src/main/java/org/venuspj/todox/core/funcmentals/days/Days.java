package org.venuspj.todox.core.funcmentals.days;

import org.venuspj.ddd.model.value.IntegerValue;
import org.venuspj.util.objects2.Objects2;

import java.text.NumberFormat;
import java.util.Locale;

public class Days implements IntegerValue {
    Integer value;

    public Days(Integer aValue) {
        value = aValue;
    }


    @Override
    public Integer asInteger() {
        return value;
    }

    @Override
    public String asText() {
        return NumberFormat.getInstance(Locale.JAPAN).format(value);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
