package jp.or.venuspj.studio.core.model.invoice;

import jp.or.venuspj.studio.core.fundamentals.moment.momentbychargegroup.MomentByChargeGroup;
import jp.or.venuspj.util.objects2.Objects2;

public class InvoiceImpl implements Invoice {
    private MomentByChargeGroup momentByChargeGroup;

    InvoiceImpl() {
    }

    public InvoiceImpl(MomentByChargeGroup aMomentByChargeGroup) {
        momentByChargeGroup = aMomentByChargeGroup;
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("momentByChargeGroup", momentByChargeGroup)
                .omitNullValues()
                .toString();
    }
}
