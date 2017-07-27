package org.venuspj.studio.generic.fundamentals.caption;

import org.venuspj.ddd.model.value.DecidableSameValueAs;
import org.venuspj.ddd.model.value.Value;
import org.venuspj.util.objects2.Objects2;

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
        return this == other || (other != null && Objects2.equal(value, other.value));
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public static Caption emptyCaption() {
        return new Caption();
    }

}
