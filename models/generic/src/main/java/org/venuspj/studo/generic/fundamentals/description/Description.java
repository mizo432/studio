package org.venuspj.studo.generic.fundamentals.description;

import org.venuspj.util.objects2.Objects2;

public class Description {
    String value;

    public Description(String aValue) {
        value = aValue;
    }

    Description() {

    }

    public static Description emptyDescription() {
        return new Description();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
