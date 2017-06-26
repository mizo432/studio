package org.venuspj.studio.core.model.news;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Title implements StringValue {
    private String value;

    Title() {

    }
    public Title(String aValue) {
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
}
