package jp.or.venuspj.studio.core.fundamentals.moment.momentbychargegroup;

import jp.or.venuspj.ddd.model.value.DecidableSameValueAs;
import jp.or.venuspj.ddd.model.value.Value;
import jp.or.venuspj.studo.general.fundamentals.datetime.RecordYearMonth;
import jp.or.venuspj.studo.general.model.relationship.thingrole.chargegroup.ChargeGroup;
import jp.or.venuspj.util.objects2.Objects2;

public class MomentByChargeGroup implements Value ,DecidableSameValueAs<MomentByChargeGroup> {
    private ChargeGroup chargeGroup;
    private RecordYearMonth recordYearMonth;

    MomentByChargeGroup() {
    }

    public MomentByChargeGroup(RecordYearMonth aRecordYearMonth, ChargeGroup aChargeGroup) {
        recordYearMonth = aRecordYearMonth;
        chargeGroup = aChargeGroup;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("recordYearMonth", recordYearMonth)
                .add("chargeGroup", chargeGroup)
                .omitNullValues()
                .toString();
    }

    @Override
    public boolean sameValueAs(MomentByChargeGroup other) {
        if (Objects2.isNull(other)) return false;
        return chargeGroup.sameIdentifierAs(other.chargeGroup) &&
                recordYearMonth.sameValueAs(other.recordYearMonth);
    }

    @Override
    public boolean equals(Object obj) {
        if (Objects2.isNull(obj)) return false;
        if (obj instanceof MomentByChargeGroup) {
            MomentByChargeGroup other = (MomentByChargeGroup) obj;
            return sameValueAs(other);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects2.hash(recordYearMonth, chargeGroup);
    }

}
