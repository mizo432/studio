package org.venuspj.studio.core.fundamentals.address;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class AddressString implements StringValue {
    private String value;

    AddressString() {
    }

    public AddressString(String aValue) {
        value = aValue;

    }


    public static AddressString emptyAddressString() {
        return new AddressString();
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
