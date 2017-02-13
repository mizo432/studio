package root.general.domain.model.chargeGroup;

import com.google.common.collect.ComparisonChain;
import jp.or.venuspj.ddd.model.entity.Identifier;
import jp.or.venuspj.ddd.model.value.StringCodeValue;
import jp.or.venuspj.util.objects2.Objects2;

public class ChargeGroupId implements StringCodeValue, Identifier<ChargeGroup>, Comparable<ChargeGroupId> {

    private String value;

    ChargeGroupId() {
    }

    public ChargeGroupId(String aValue) {
        value = aValue;
    }

    public int compareTo(ChargeGroupId o) {
        return ComparisonChain
                .start()
                .compare(value, o.value)
                .result();
    }

    @Override
    public String asText() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof ChargeGroupId) {
            ChargeGroupId other = (ChargeGroupId) obj;
            return Objects2.equal(value, other.value);

        }

        return false;
    }
}
