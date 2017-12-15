package org.venuspj.studio.generic.fundamentals.geographic;

import org.venuspj.util.strings2.Strings2;

import java.io.Serializable;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Latitude implements Serializable {
    private String value;

    public Latitude(String value) {
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

    public static Latitude emptyLatitude() {
        return new Latitude("");
    }
}
