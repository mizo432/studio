package root.core.model.invoice.detail;

import jp.or.venuspj.ddd.model.value.ListValue;
import jp.or.venuspj.util.objects2.Objects2;

import java.util.List;

/**
 * Created by mizoguchi on 2017/02/14.
 */
public class InvoiceDetails implements ListValue<InvoiceDetail> {

    private List<InvoiceDetail> list;

    InvoiceDetails() {
    }

    public InvoiceDetails(List<InvoiceDetail> aList) {
        list = aList;
    }

    @Override
    public List<InvoiceDetail> asList() {
        return list;
    }

    @Override
    public String toString() {
        return Objects2.toStringHelper(this)
                .addValue(list)
                .toString();
    }
}
