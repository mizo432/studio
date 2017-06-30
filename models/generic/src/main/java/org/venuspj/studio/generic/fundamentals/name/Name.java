package org.venuspj.studio.generic.fundamentals.name;

import org.venuspj.ddd.model.value.StringValue;
import org.venuspj.util.objects2.Objects2;

public class Name implements StringValue{
    private String value;

    Name() {

    }

    public Name(String aValue) {
        value = aValue;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public String asText() {
        return value;
    }

    public static Name defaultName() {
        return new Name();
    }

}
