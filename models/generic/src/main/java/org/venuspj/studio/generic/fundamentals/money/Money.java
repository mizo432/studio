package org.venuspj.studio.generic.fundamentals.money;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * 金額と通貨.
 */
public class Money {
    protected Amount amount = Amount.zero();
    protected Locale locale = Locale.JAPAN;

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

    public String asDisplayText(){
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        return nf.format(amount.asInteger());
    }

}
