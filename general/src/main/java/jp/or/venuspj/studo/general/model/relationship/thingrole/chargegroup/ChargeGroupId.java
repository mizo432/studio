package jp.or.venuspj.studo.general.model.relationship.thingrole.chargegroup;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.util.objects2.Objects2;

public class ChargeGroupId implements Value,DecidableSameValueAs<ChargeGroupId> {
    private Integer value;

    ChargeGroupId() {

    }

    ChargeGroupId(Integer aValue) {
        value = aValue;

    }

    @Override
    public boolean sameValueAs(ChargeGroupId other) {

        return Objects2.nonNull(other) &&
                Objects2.equal(value, other.value);
    }

    Integer asInteger() {
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
