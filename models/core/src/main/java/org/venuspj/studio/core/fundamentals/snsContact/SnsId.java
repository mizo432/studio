package org.venuspj.studio.core.fundamentals.snsContact;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class SnsId implements StringValue {
    private String value;

    SnsId() {

    }

    public SnsId(String aValue) {
        value = aValue;

    }

    @Override
    public String asText() {
        return value;
    }

    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
