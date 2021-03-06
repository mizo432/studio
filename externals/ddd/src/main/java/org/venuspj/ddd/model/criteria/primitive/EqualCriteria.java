package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.util.function.Predicate;

public class EqualCriteria<T> extends AbstractCriteria implements Predicate<T> {
    private T value;

    public EqualCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> EqualCriteria<T> create(Criteria aParentCriteria) {
        return new EqualCriteria<>(aParentCriteria);
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
                && value.equals(aValue);
    }
}
