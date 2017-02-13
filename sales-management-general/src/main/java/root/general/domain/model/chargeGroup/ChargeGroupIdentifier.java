package root.general.domain.model.chargeGroup;

import jp.or.venuspj.ddd.model.entity.AbstractEntityIdentifier;
import jp.or.venuspj.util.objects2.Objects2;

public class ChargeGroupIdentifier extends AbstractEntityIdentifier<ChargeGroup> {
    private ChargeGroupId chargeGroupId;

    ChargeGroupIdentifier() {
        super(ChargeGroup.class);
    }

    public ChargeGroupIdentifier(ChargeGroupId aChargeGroupId) {
        super(ChargeGroup.class);
        chargeGroupId = aChargeGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ChargeGroupId) {
            ChargeGroupIdentifier other = (ChargeGroupIdentifier) o;
            return super.equals(o) &&
                    Objects2.equal(chargeGroupId, other.chargeGroupId);
        }
        return false;
    }
}
