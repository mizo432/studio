package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class GraterOrEqualCriteria<T> extends AbstractCriteria {
    private T value;

    public GraterOrEqualCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> GraterOrEqualCriteria<T> create(Criteria aParentCriteria) {
        return new GraterOrEqualCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
