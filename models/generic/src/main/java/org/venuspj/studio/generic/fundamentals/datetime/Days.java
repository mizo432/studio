package org.venuspj.studio.generic.fundamentals.datetime;

import org.venuspj.ddd.model.value.IntegerValue;
import org.venuspj.util.objects2.Objects2;

import java.text.NumberFormat;
import java.util.Locale;

import static org.venuspj.util.objects2.Objects2.*;

public class Days implements IntegerValue<Days> {

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
    public String asText() {
        return NumberFormat.getInstance(Locale.JAPAN).format(value);
    }

    @Override
    public boolean sameValueAs(Days other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj)) return false;
        if (!(obj instanceof Days)) return false;
        Days that = (Days) obj;
        return equal(value, that.value);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

}
