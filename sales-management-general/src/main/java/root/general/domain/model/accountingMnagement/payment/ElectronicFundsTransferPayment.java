package root.general.domain.model.accountingMnagement.payment;

import root.general.domain.fundamentals.Amount;
import root.general.domain.fundamentals.RecordDate;
import root.general.domain.model.bankAccount.BankAccount;

/**
 * 電気資金移送.
 */
public class ElectronicFundsTransferPayment extends Payment {
    BankAccount from;
    BankAccount to;

    ElectronicFundsTransferPayment() {

    }

    public ElectronicFundsTransferPayment(PaymentIdentifier anIdentifier,
                                          RecordDate aRecordDate,
                                          SendPaymentOrReceivePayment aSendPaymentOrReceivePayment,
                                          Amount anAmount, BankAccount aFrom, BankAccount aTo) {
        super(anIdentifier, aRecordDate, aSendPaymentOrReceivePayment, anAmount);
        from = aFrom;
        to = aTo;

    }
}
