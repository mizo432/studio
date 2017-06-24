package org.venuspj.studio.core.fundamentals.address.prefecture;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Prefecture implements StringValue {
    private String value;

    Prefecture() {
    }

    public Prefecture(String aValue) {
        value = aValue;
    }

    public static Prefecture defaultPrefecture() {
        return new Prefecture("神奈川県");
    }

    @Override
    public String asText() {
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
