package org.venuspj.ddd.model.criteria.number;

import org.venuspj.ddd.model.criteria.AbstractEnumerableCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

public class IntegerCriteria extends AbstractEnumerableCriteria<Integer> {
    public IntegerCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public IntegerCriteria() {
        super();
    }

    public static IntegerCriteria empty(Criteria aParentCriteria) {
        return new IntegerCriteria(aParentCriteria);
    }

}
