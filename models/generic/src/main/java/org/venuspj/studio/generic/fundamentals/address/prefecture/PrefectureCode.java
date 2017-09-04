package org.venuspj.studio.generic.fundamentals.address.prefecture;

import org.venuspj.ddd.model.entity.IntegerIdValue;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;

/**
 */
public class PrefectureCode implements IntegerIdValue<PrefectureCode> {
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
    public boolean sameValueAs(PrefectureCode other) {
        return equals(other);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (isNull(obj)) return false;
        if (!(obj instanceof PrefectureCode)) return false;
        PrefectureCode that = (PrefectureCode) obj;
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
