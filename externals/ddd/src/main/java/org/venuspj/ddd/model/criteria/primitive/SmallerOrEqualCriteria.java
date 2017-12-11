package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class SmallerOrEqualCriteria<T> extends AbstractCriteria {
    private T value;

    public SmallerOrEqualCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> SmallerOrEqualCriteria<T> create(Criteria aParentCriteria) {
        return new SmallerOrEqualCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
