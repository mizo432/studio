package org.venuspj.studio.core.fundamentals.name;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

public class Name implements StringValue {
    private String value;

    Name() {
    }

    public Name(String aValue) {
        value = aValue;
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

    public static Name defaultName() {
        return new Name();
    }
}
