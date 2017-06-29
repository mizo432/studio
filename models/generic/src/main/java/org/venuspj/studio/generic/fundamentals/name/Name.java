package org.venuspj.studio.generic.fundamentals.name;

import org.venuspj.util.objects2.Objects2;

public class Name {
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
}
