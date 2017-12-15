package org.venuspj.studio.generic.fundamentals.caption;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.equal;
import static org.venuspj.util.objects2.Objects2.hash;

public class Caption implements Value, DecidableSameValueAs<Caption> {
    private String value;

    Caption() {
    }

    public Caption(String aValue) {
        value = aValue;
    }

    public String asText() {
        return value;
    }

    public boolean sameValueAs(Caption other) {
        return equals(other);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
    @Override
    public int hashCode() {
        return hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        return obj instanceof Caption &&
                equal(((Caption) obj).value, value);

    }

    public static Caption emptyCaption() {
        return new Caption();
    }

}
