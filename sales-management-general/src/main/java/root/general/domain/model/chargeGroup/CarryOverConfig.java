package root.general.domain.model.chargeGroup;

import jp.or.venuspj.util.objects2.Objects2;
import root.general.domain.fundamentals.Amount;
import root.general.domain.fundamentals.count.Count;

/**
 * 繰越設定.
 * <pre>繰越可能回数・繰越可能金額</pre>
 */
public class CarryOverConfig {
    Count carryOverMonthCount;
    Amount carryOverChargeAmount;

    CarryOverConfig() {
    }

    public CarryOverConfig(Count aCarryOverMonthCount,
                           Amount aCarryOverChargeAmount) {
        carryOverMonthCount = aCarryOverMonthCount;
        carryOverChargeAmount = aCarryOverChargeAmount;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("carryOverMonthCount", carryOverMonthCount)
                .add("carryOverChargeAmount", carryOverChargeAmount)
                .omitNullValues()
                .toString();
    }
}
