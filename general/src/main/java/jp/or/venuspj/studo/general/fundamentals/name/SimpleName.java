package jp.or.venuspj.studo.general.fundamentals.name;

import jp.or.venuspj.ddd.model.value.StringValue;
import jp.or.venuspj.util.objects2.Objects2;

/**
 * 単純な名前
 */
public class SimpleName implements Name, StringValue {

    private String value;

    SimpleName() {
    }

    public SimpleName(String aValue) {
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
}
