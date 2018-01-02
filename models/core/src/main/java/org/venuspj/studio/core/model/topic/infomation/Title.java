package org.venuspj.studio.core.model.topic.infomation;

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

    public static Title empty() {
        return new Title();
    }

    @Override
    public String asText() {
        return value;
    }
}
