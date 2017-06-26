package org.venuspj.studio.core.fundamentals.note;

import org.venuspj.studio.core.fundamentals.StringValue;
import org.venuspj.util.objects2.Objects2;

/**
 */
public class Note implements StringValue {
    private String value;

    Note() {
        value = "";
    }

    public Note(String aValue) {
        value = aValue;
    }

    @Override
    public String asText() {
        return value;
    }

    public static Note defailtNote() {
        return new Note();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
