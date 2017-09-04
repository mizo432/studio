package org.venuspj.studio.generic.fundamentals.description;

import org.venuspj.util.objects2.Objects2;

import static org.venuspj.util.objects2.Objects2.*;
import static org.venuspj.util.strings2.Strings2.*;

/**
 * 複数行の文章
 */
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

    public boolean isPresent() {
        return nonNull(value) && isNotEmpty(value);
    }

}
