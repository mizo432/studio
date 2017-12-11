package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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
