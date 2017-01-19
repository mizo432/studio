package jp.or.venuspj.studo.general.model.relationship.thingrole.chargegroup;

import jp.or.venuspj.ddd.model.entity.Entity;
import jp.or.venuspj.ddd.model.value.Value;

public interface ChargeGroup extends Entity<ChargeGroup>,Value<ChargeGroup> {

    ChargeGroupId chargeGroupId();
}
