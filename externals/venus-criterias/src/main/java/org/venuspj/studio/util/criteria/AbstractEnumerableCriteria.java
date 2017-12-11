package org.venuspj.studio.util.criteria;

import org.venuspj.studio.util.criteria.primitive.*;

public class AbstractEnumerableCriteria<T> extends AbstractConcreteCriteria<T> {

    private BetweenCriteria<T> betweenCriteria = BetweenCriteria.create(this);
    private GraterCriteria<T> graterCriteria = GraterCriteria.create(this);
    private GraterOrEqualCriteria<T> graterOrEqualCriteria = GraterOrEqualCriteria.create(this);
    private SmallerOrEqualCriteria<T> smallerOrEqualCriteria = SmallerOrEqualCriteria.create(this);
    private SmallerCriteria<T> smallerCriteria = SmallerCriteria.create(this);

    public AbstractEnumerableCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public AbstractEnumerableCriteria() {
        super();
    }


    public void between(T aFrom, T aTo) {
        betweenCriteria.setValue(aFrom, aTo);
        present();
    }


    public BetweenCriteria<T> getBetweenCriteria() {
        return betweenCriteria;
    }

    public void graterThan(T aValue) {
        graterCriteria.setValue(aValue);
        present();
    }


    public GraterCriteria<T> getGraterThan() {
        return graterCriteria;
    }

    public void GraterThanOrEqualThan(T aValue) {
        graterOrEqualCriteria.setValue(aValue);
        present();
    }


    public GraterOrEqualCriteria<T> getGraterThanOrEqualThan() {
        return graterOrEqualCriteria;
    }

    public void smallerThan(T aValue) {
        smallerCriteria.setValue(aValue);
        present();
    }


    public SmallerCriteria<T> getSmallerThan() {
        return smallerCriteria;
    }

    public void smallerThanOrEqual(T aValue) {
        smallerOrEqualCriteria.setValue(aValue);
        present();
    }


    public SmallerOrEqualCriteria<T> getSmallerThanOrEqual() {
        return smallerOrEqualCriteria;
    }

}
