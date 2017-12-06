package org.venuspj.studio.core.model.momentInterval.momemt.news;

import org.venuspj.studio.core.fundamentals.StringValue;

import static org.venuspj.util.objects2.Objects2.toStringHelper;

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
        return toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
