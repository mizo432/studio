package root.general.domain.model.accountingMnagement.payment;

import jp.or.venuspj.util.builder.ObjectBuilder;
import jp.or.venuspj.util.objects2.Objects2;
import root.general.domain.fundamentals.Amount;
import root.general.domain.fundamentals.RecordDate;

/**
 */
abstract class AbstractPaymentBuilder<P extends Payment, B extends AbstractPaymentBuilder<P, B>> extends ObjectBuilder<P, B> {
    PaymentIdentifier identifier;
    RecordDate recordDate;
    SendPaymentOrReceivePayment sendPaymentOrReceivePayment;
    Amount amount;

    @Override
    protected void apply(P vo, B builder) {
        builder.withIdentifier(vo.identifier);
        builder.withRecordDate(vo.recordDate);
        builder.withSendPaymentOrReceivePayment(vo.sendPaymentOrReceivePayment);
        builder.withAmount(vo.amount);

    }

    public B withAmount(Amount anAmount) {
        if (Objects2.isNull(anAmount)) getThis();
        addConfigurator(builder -> builder.amount = anAmount);
        return getThis();

    }

    public B withSendPaymentOrReceivePayment(SendPaymentOrReceivePayment aSendPaymentOrReceivePayment) {
        if (Objects2.isNull(aSendPaymentOrReceivePayment)) getThis();
        addConfigurator(builder -> builder.sendPaymentOrReceivePayment = aSendPaymentOrReceivePayment);
        return getThis();
    }

    public B withIdentifier(PaymentIdentifier anIdentifier) {
        if (Objects2.isNull(anIdentifier)) getThis();
        addConfigurator(builder -> builder.identifier = anIdentifier);
        return getThis();
    }

    public B withRecordDate(RecordDate aRecordDate) {
        if (Objects2.isNull(aRecordDate)) getThis();
        addConfigurator(builder -> builder.recordDate = aRecordDate);
        return getThis();
    }

}
