package jp.or.venuspj.studio.core.fundamentals;

import jp.or.venuspj.util.objects2.Objects2;

public class Name implements StringValue {
    private String value;

    Name() {
    }

    public Name(String aValue) {
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

    public static Name defaultName() {
        return new Name();
    }
}
