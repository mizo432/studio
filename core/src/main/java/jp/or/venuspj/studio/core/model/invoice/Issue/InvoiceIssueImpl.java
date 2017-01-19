package jp.or.venuspj.studio.core.model.invoice.Issue;

import jp.or.venuspj.studio.core.fundamentals.moment.momentbychargegroup.MomentByChargeGroup;
import jp.or.venuspj.util.objects2.Objects2;

public class InvoiceIssueImpl implements InvoiceIssue {

    private MomentByChargeGroup momentByChargeGroup;
    private InvoiceIssueNo invoiceIssueNo;
    InvoiceIssueImpl() {

    }

    public InvoiceIssueImpl(MomentByChargeGroup aMomentByChargeGroup,InvoiceIssueNo aninvoiceIssueNo) {
        momentByChargeGroup = aMomentByChargeGroup;
        invoiceIssueNo = aninvoiceIssueNo;

    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("momentByChargeGroup",momentByChargeGroup)
                .add("invoiceIssueNo",invoiceIssueNo)
                .omitNullValues()
                .toString();
    }
}
