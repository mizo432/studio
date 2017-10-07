package org.venuspj.studio.core.fundamentals.note;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 * @deprecated use Description
 */
public class Note implements StringValue {
    private String value;

    Note() {
        value = "";
    }

    public Note(String aValue) {
        value = aValue;
    }

    public static Note defailtNote() {
        return new Note();
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
