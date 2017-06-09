package jp.or.venuspj.studio.core.fundamentals.note;

import jp.or.venuspj.studio.core.fundamentals.StringValue;

/**
 */
public class Note implements StringValue {
    private String value;

    Note() {
        value = "";
    }

    Note(String aValue) {
        value = aValue;
    }

    @Override
    public String asText() {
        return value;
    }

    public static Note defailtNote() {
        return new Note();
    }
}
