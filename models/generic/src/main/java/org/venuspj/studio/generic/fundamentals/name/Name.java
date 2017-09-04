package org.venuspj.studio.generic.fundamentals.name;

import org.venuspj.ddd.model.value.StringValue;
import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;
import static org.venuspj.util.strings2.Strings2.*;

public class Name implements StringValue{
    private String value;

    Name() {

    }

    public Name(String aValue) {
        value = aValue;

    }

    public static Name defaultName() {
        return new Name();
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

    public boolean isPresent() {
        return nonNull(value) && isNotEmpty(value);
    }
}
