package org.venuspj.studio.core.model.news;

import org.venuspj.studio.core.fundamentals.StringValue;

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

    public static Title empty() {
        return new Title();
    }
}
