package org.venuspj.studio.generic.fundamentals.money;

import org.venuspj.util.objects2.Objects2;

import java.util.Currency;
import java.util.Locale;

/**
 * 金額と通貨.
 */
public class Money {
    protected Amount amount = Amount.zero();
    protected Currency currency = Currency.getInstance(Locale.JAPAN);

    Money() {
    }

    public Money(Amount anAmount) {
        amount = anAmount;
    }

    public Money(Integer aValue) {
        amount = new Amount(aValue);
    }

    public static Money zero() {
        return new Money(Amount.zero());
    }

    public static Money empty() {
        return new Money(Amount.empty());
    }

    public boolean isEmpty() {
        return amount.isEmpty();
    }

    @Override
    public String toString() {
        return Objects2
                .toStringHelper(this)
                .add("amount", amount)
                .add("currency", currency)
                .omitNullValues()
                .toString();
    }
}
