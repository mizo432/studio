package org.venuspj.ddd.model.criteria;

import org.venuspj.ddd.model.criteria.primitive.*;

import java.util.Collection;

public abstract class AbstractConcreteCriteria<T> extends AbstractCriteria {

    private EqualCriteria<T> equalCriteria = EqualCriteria.create(this);
    private NotEqualCriteria<T> notEqualCriteria = NotEqualCriteria.create(this);
    private InCriteria<T> inCriteria = InCriteria.create(this);
    private NotInCriteria<T> notInCriteria = NotInCriteria.create(this);
    private IsNullCriteria isNullCriteria = IsNullCriteria.create(this);
    private IsNotNullCriteria isNotNullCriteria = IsNotNullCriteria.create(this);

    public AbstractConcreteCriteria() {
        super();
    }

    public AbstractConcreteCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public void equal(T aValue) {
        equalCriteria.setValue(aValue);
        present();
    }

    public EqualCriteria<T> getEqual() {
        return equalCriteria;
    }

    public void notEqual(T aValue) {
        notEqualCriteria.setValue(aValue);
        present();
    }

    public NotEqualCriteria<T> getNotEqual() {
        return notEqualCriteria;
    }

    public InCriteria<T> getIn() {
        return inCriteria;
    }

    public void in(Collection<T> anyCollection) {
        inCriteria.setValue(anyCollection);
        present();
    }
    public NotInCriteria<T> getNotIn() {
        return notInCriteria;
    }

    public void notIn(Collection<T> anyCollection) {
        notInCriteria.setValue(anyCollection);
        present();
    }

    public void isNull(boolean aValue) {
        isNullCriteria.setValue(aValue);
    }

    public IsNullCriteria isNull() {
        return isNullCriteria;
    }

    public void isNotNull(boolean aValue) {
        isNotNullCriteria.setValue(aValue);
    }

    public IsNotNullCriteria isNotNull() {
        return isNotNullCriteria;
    }

}
