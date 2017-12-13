package org.venuspj.studio.generic.fundamentals.description;

import org.venuspj.ddd.model.value.StringValue;

import static org.venuspj.util.objects2.Objects2.*;
import static org.venuspj.util.strings2.Strings2.*;

/**
 * 複数行の文章
 */
public class Description implements StringValue {
    String value;

    public Description(String aValue) {
        value = aValue;
    }

    Description() {

    }

    public static Description empty() {
        return new Description();
    }

    public boolean isPresent() {
        return nonNull(value) && isNotEmpty(value);
    }

    @Override
    public String asText() {
        return value;
    }
}
