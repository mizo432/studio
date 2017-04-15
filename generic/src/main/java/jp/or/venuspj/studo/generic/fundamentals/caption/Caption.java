package jp.or.venuspj.studo.generic.fundamentals.caption;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

public class Caption implements Value, DecidableSameValueAs<Caption> {
    private String value;

    Caption() {
    }

    public Caption(String aValue) {
        value = aValue;
    }

    public String asText() {
        return value;
    }

    public boolean sameValueAs(Caption other) {
        return false;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
