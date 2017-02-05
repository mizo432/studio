package jp.or.venuspj.ColorUml.domain.model.role;

import jp.or.venuspj.ddd.model.value.IntegerValue;
import jp.or.venuspj.util.objects2.Objects2;

public class AssignedNumber implements IntegerValue {

    private Integer value;

    AssignedNumber() {
    }

    AssignedNumber(Integer aValue) {
        value = aValue;
    }

    public Integer asInteger() {
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
