package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

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
