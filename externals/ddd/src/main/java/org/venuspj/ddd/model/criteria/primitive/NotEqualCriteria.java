package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.function.Predicate;

public class NotEqualCriteria<T> extends AbstractCriteria implements Predicate<T> {
    private T value;

    public NotEqualCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> NotEqualCriteria<T> create(Criteria aParentCriteria) {
        return new NotEqualCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }

    public boolean test(T aValue) {
        return isSpecified()
                && !value.equals(aValue);
    }
}
