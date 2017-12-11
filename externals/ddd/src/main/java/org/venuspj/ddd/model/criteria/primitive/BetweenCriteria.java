package org.venuspj.ddd.model.criteria.primitive;

import org.venuspj.ddd.model.criteria.AbstractCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class BetweenCriteria<T> extends AbstractCriteria {
    private T from;
    private T to;

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
