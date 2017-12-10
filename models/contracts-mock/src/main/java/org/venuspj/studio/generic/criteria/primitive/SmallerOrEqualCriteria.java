package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class SmallerOrEqualCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public SmallerOrEqualCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> SmallerOrEqualCriteria<T> create(AbstractCriteria aParentCriteria) {
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
