package org.venuspj.ddd.model.criteria.datetime;

import org.venuspj.ddd.model.criteria.AbstractEnumerableCriteria;
import org.venuspj.ddd.model.criteria.Criteria;

import java.time.YearMonth;

public class YearMonthCriteria extends AbstractEnumerableCriteria<YearMonth> {
    public YearMonthCriteria(Criteria aParentCriteria) {
        super(aParentCriteria);
    }

    public YearMonthCriteria() {
        super();
    }

    public static YearMonthCriteria empty(Criteria aParentCriteria) {
        return new YearMonthCriteria(aParentCriteria);
    }

}
