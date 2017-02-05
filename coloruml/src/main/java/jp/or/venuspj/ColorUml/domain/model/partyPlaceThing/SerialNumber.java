package jp.or.venuspj.ColorUml.domain.model.partyPlaceThing;


import jp.or.venuspj.ddd.model.value.IntegerValue;
import jp.or.venuspj.util.objects2.Objects2;


/**
 * Created by mizoguchi on 2017/02/04.
 */
public class SerialNumber implements IntegerValue {
    Integer value;

    SerialNumber() {

    }
    public SerialNumber(Integer aValue) {
        value = aValue;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public Integer asInteger() {
        return value;
    }
}
