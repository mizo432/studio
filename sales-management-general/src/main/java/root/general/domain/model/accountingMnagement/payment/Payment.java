package root.general.domain.model.accountingMnagement.payment;

import root.general.domain.fundamentals.Amount;
import root.general.domain.fundamentals.RecordDate;

/**
 * 支払い
 */

public class Payment {
    PaymentIdentifier identifier;
    RecordDate recordDate;
    SendPaymentOrReceivePayment sendPaymentOrReceivePayment;
    Amount amount;

    Payment() {
    }

    public Payment(PaymentIdentifier anIdentifier,
                   RecordDate aRecordDate,
                   SendPaymentOrReceivePayment aSendPaymentOrReceivePayment,
                   Amount anAmount) {
        recordDate = aRecordDate;
        identifier = anIdentifier;
        sendPaymentOrReceivePayment = aSendPaymentOrReceivePayment;
        amount = anAmount;
    }
}
