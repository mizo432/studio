package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class GraterOrEqialCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public GraterOrEqialCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> GraterOrEqialCriteria<T> create(AbstractCriteria aParentCriteria) {
        return new GraterOrEqialCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
