package org.venuspj.studio.core.fundamentals.contact;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

import java.net.URI;

/**
 */
public class HomepageUri implements StringValue {
    URI value;

    HomepageUri() {
    }

    HomepageUri(URI aValue) {
        value = aValue;
    }

    @Override
    public String asText() {
        return value.toString();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
