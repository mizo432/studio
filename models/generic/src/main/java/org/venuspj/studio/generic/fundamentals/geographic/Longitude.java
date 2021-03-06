package org.venuspj.studio.generic.fundamentals.geographic;

import org.venuspj.util.strings2.Strings2;

import java.io.Serializable;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Longitude implements Serializable {

    String value;

    public Longitude(String value) {
        this.value = value;
    }

    public boolean isUndefined() {
        return Strings2.isEmpty(value) || "0.0".equals(value);
    }

    public String asText() {
        return value;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }

    public static Longitude emptyLongitude() {
        return new Longitude("");
    }
}
