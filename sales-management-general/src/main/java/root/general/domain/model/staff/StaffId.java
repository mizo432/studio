package root.general.domain.model.staff;

import com.google.common.collect.ComparisonChain;
import jp.or.venuspj.util.objects2.Objects2;
import root.general.domain.fundamentals.IntegerIdentifier;

/**
 * Created by mizoguchi on 2017/02/12.
 */
public class StaffId implements Comparable<StaffId>, IntegerIdentifier {
    private Integer value;

    StaffId() {
    }

    StaffId(Integer aValue) {
        value = aValue;
    }

    @Override
    public int compareTo(StaffId o) {
        return ComparisonChain
                .start()
                .compare(value, o.value)
                .result();
    }

    @Override
    public Integer asInteger() {
        return value;
    }

    @Override
    public String asText() {
        return String.valueOf(value);
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .addValue(value)
                .toString();
    }

    @Override
    public int hashCode() {
        return Objects2.hash(value);
    }
}
