package org.venuspj.studio.util.criteria.primitive;

import org.venuspj.studio.util.criteria.AbstractCriteria;
import org.venuspj.studio.util.criteria.Criteria;

public class BetweenCriteria<T> extends AbstractCriteria {
    T from;
    T to;

    public BetweenCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public BetweenCriteria() {
        super();
    }

    public static <T> BetweenCriteria<T> create(Criteria aParentCriteria) {
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
