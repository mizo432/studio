package org.venuspj.studio.core.fundamentals.address;

import org.venuspj.util.objects2.Objects2;

public class Address {

    public static Address nullAddress() {
        return new Address();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .omitNullValues()
                .toString();
    }
}
