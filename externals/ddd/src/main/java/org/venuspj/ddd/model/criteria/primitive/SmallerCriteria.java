package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class SmallerCriteria<T> extends AbstractCriteria {
    private T value;

    public SmallerCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> SmallerCriteria<T> create(Criteria aParentCriteria) {
        return new SmallerCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
