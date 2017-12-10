package org.venuspj.studio.generic.criteria.primitive;

import org.venuspj.studio.generic.criteria.AbstractCompositeCriteria;
import org.venuspj.studio.generic.criteria.AbstractCriteria;

public class BetweenCriteria<T> extends AbstractCompositeCriteria {
    T from;
    T to;

    public BetweenCriteria(AbstractCriteria aParentCriteria) {
        super(aParentCriteria);
    }

    public BetweenCriteria() {
        super();
    }

    public static <T> BetweenCriteria<T> create(AbstractCriteria aParentCriteria) {
        return new BetweenCriteria<>(aParentCriteria);
    }

    public T getFrom() {
        return from;
    }

    public T getTo() {
        return to;
    }

    public void setValue(T aFrom, T aTo) {
        from = aFrom;
        to = aTo;
        present();
    }

}
