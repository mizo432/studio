package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class EqualCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public EqualCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> EqualCriteria<T> create(AbstractCriteria aParentCriteria) {
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
