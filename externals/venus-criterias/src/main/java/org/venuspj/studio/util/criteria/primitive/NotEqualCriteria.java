package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

public class NotEqualCriteria<T> extends AbstractCriteria {
    private T value;

    public NotEqualCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> NotEqualCriteria<T> create(Criteria aParentCriteria) {
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
