package org.venuspj.studio.generic.fundamentals.code;

import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

public class Code implements StringValue {
    private final String value;

    public Code(String aValue){
        value = aValue;
    }

    @Override
    public String asText() {
        return null;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
