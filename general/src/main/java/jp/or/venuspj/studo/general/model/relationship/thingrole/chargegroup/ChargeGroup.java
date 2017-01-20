package jp.or.venuspj.studo.general.model.relationship.thingrole.chargegroup;

import jp.or.venuspj.ddd.model.entity.Entity;
import jp.or.venuspj.ddd.model.value.DecidableSameIdentifierAs;
import jp.or.venuspj.ddd.model.value.Value;

public interface ChargeGroup extends Entity<ChargeGroup>,Value, DecidableSameIdentifierAs<ChargeGroup> {

    ChargeGroupId chargeGroupId();

    boolean sameIdentifierAs(ChargeGroup chargeGroup);
}
