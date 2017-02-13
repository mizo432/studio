package root.core.model.invoice;

import jp.or.venuspj.util.objects2.Objects2;
import root.core.model.invoice.detail.InvoiceDetails;
import root.general.domain.fundamentals.RecordYearMonth;
import root.general.domain.model.chargeGroup.ChargeGroup;

/**
 */
public class Invoice {
    ChargeGroup chargeGroup;
    RecordYearMonth recordYearMonth;
    InvoiceDetails invoiceDetails;

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("chargeGroup",chargeGroup)
                .add("recordYearMonth",recordYearMonth)
                .add("invoiceDetails",invoiceDetails)
                .omitNullValues()
                .toString();
    }
}
