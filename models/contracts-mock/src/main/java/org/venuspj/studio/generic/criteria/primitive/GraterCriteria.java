package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class GraterCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public GraterCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> GraterCriteria<T> create(AbstractCriteria aParentCriteria) {
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
