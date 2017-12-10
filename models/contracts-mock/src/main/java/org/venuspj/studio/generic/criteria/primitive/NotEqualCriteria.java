package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class NotEqualCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public NotEqualCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> NotEqualCriteria<T> create(AbstractCriteria aParentCriteria) {
        return new NotEqualCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
