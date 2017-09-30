package org.venuspj.studio.generic.fundamentals.code;

import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.*;

public class Code implements StringValue {
    private final String value;

    public Code(String aValue) {
        value = aValue;
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (isNull(obj)) return false;
        if (this == obj) return true;
        return obj instanceof Code && equal(value, ((Code) obj).value);
    }

    @Override
    public int hashCode() {
        return hash(value);
    }

    public boolean sameValueAs(Code aCode) {
        return equals(aCode);
    }
}
