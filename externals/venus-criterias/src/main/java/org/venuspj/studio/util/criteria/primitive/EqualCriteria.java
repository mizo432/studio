package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

public class EqualCriteria<T> extends AbstractCriteria {
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
}
