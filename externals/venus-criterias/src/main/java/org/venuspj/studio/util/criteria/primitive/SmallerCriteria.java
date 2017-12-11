package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

public class SmallerCriteria<T> extends AbstractCriteria {
    private T value;

    public SmallerCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> SmallerCriteria<T> create(Criteria aParentCriteria) {
        return new SmallerCriteria<>(aParentCriteria);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T aValue) {
        value = aValue;
        present();
    }
}
