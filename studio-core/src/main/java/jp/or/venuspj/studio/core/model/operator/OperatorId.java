package jp.or.venuspj.studio.core.model.operator;

import jp.or.venuspj.util.objects2.Objects2;

public class OperatorId {

    public static final OperatorId EMPTY = new OperatorId();

    private Integer value;

    OperatorId() {
    }

    public OperatorId(Integer aValue) {
        value = aValue;
    }

    public boolean isPresent() {
        return Objects2.nonNull(value);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }
}
