package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class GraterCriteria<T> extends AbstractCriteria {
    private T value;

    public GraterCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> GraterCriteria<T> create(Criteria aParentCriteria) {
        return new GraterCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
