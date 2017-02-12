package root.general.domain.model.accountingMnagement.payment;

import jp.or.venuspj.util.objects2.Objects2;
import root.general.domain.model.bankAccount.BankAccount;

/**
 */
public class ElectronicFundsTransferPaymentBuilder extends AbstractPaymentBuilder<ElectronicFundsTransferPayment, ElectronicFundsTransferPaymentBuilder> {
    BankAccount from;
    BankAccount to;


    @Override
    protected void apply(ElectronicFundsTransferPayment vo, ElectronicFundsTransferPaymentBuilder builder) {
        builder.withIdentifier(vo.identifier);
        builder.withRecordDate(vo.recordDate);
        builder.withSendPaymentOrReceivePayment(vo.sendPaymentOrReceivePayment);
        builder.withAmount(vo.amount);
        builder.withFrom(vo.from);
        builder.withTo(vo.to);


    }

    public ElectronicFundsTransferPaymentBuilder withFrom(BankAccount aFrom) {
        if (Objects2.isNull(aFrom)) getThis();
        addConfigurator(builder -> builder.from = aFrom);
        return getThis();

    }

    public ElectronicFundsTransferPaymentBuilder withTo(BankAccount aTo) {
        if (Objects2.isNull(aTo)) getThis();
        addConfigurator(builder -> builder.to = aTo);
        return getThis();

    }

    @Override
    protected ElectronicFundsTransferPayment createValueObject() {
        return new ElectronicFundsTransferPayment(identifier, recordDate, sendPaymentOrReceivePayment, amount, from, to);
    }

    @Override
    protected ElectronicFundsTransferPaymentBuilder getThis() {
        return this;
    }

    @Override
    protected ElectronicFundsTransferPaymentBuilder newInstance() {
        return new ElectronicFundsTransferPaymentBuilder();
    }
}
