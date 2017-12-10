package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class SmallerCriteria<T> extends AbstractCompositeCriteria {
    private T value;

    public SmallerCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public static <T> SmallerCriteria<T> create(AbstractCriteria aParentCriteria) {
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
